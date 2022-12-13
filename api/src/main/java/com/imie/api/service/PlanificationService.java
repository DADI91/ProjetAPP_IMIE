package com.imie.api.service;

import com.imie.api.model.Planification;
import com.imie.api.repository.PlanificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanificationService {

    @Autowired
    private PlanificationRepository planificationRepository;

    public List<Planification> getAllPlanifications() {
        return (List<Planification>) planificationRepository.findAll();
    }

    public Planification getPlanificationById(Long id) {
        return planificationRepository.findById(id).orElse(null);
    }

    public Planification savePlanification(Planification planification) {
        return planificationRepository.save(planification);
    }

    public void deletePlanification(Long id) {
        planificationRepository.deleteById(id);
    }
}
