package com.imie.api.controller;

import com.imie.api.model.Planification;
import com.imie.api.service.PlanificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/planifications")
public class PlanificationController {

    @Autowired
    private PlanificationService planificationService;

    @GetMapping
    public List<Planification> getAllPlanifications() {
        return planificationService.getAllPlanifications();
    }

    @GetMapping("/{id}")
    public Planification getPlanificationById(@PathVariable Long id) {
        return planificationService.getPlanificationById(id);
    }

    @PostMapping
    public Planification savePlanification(@RequestBody Planification planification) {
        // vérifier si la planification est pour la semaine courante ou la semaine suivante
        Calendar dateDebutCalendar = Calendar.getInstance();
        int weekNumber = dateDebutCalendar.get(Calendar.WEEK_OF_YEAR);
        dateDebutCalendar.setTime(planification.getDateDebut());
        if (dateDebutCalendar.get(Calendar.WEEK_OF_YEAR) == weekNumber ||
                dateDebutCalendar.get(Calendar.WEEK_OF_YEAR) == weekNumber + 1) {
            return planificationService.savePlanification(planification);
        }
        else {
            throw new IllegalArgumentException("La planification doit être pour la semaine courante ou la semaine suivante");
        }

    }

    @DeleteMapping("/{id}")
    public void deletePlanification(@PathVariable Long id) {
        planificationService.deletePlanification(id);
    }
}
