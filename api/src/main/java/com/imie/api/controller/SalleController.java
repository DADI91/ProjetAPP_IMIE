package com.imie.api.controller;

import com.imie.api.model.Salle;
import com.imie.api.model.Type_Salle;
import com.imie.api.service.SalleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class SalleController {
    @Autowired
    private SalleService salleService;

    @GetMapping("/salles")
    public Iterable<Salle> getSalle(){
        return salleService.getSalle();
    }

    @GetMapping("/salle/{id}")
    public Salle getSalle(@PathVariable("id") final Long idSalle){
        Optional<Salle> salle = salleService.getSalle(idSalle);
        if(salle.isPresent()){
            return salle.get();
        }else {
            return null;
        }
    }

    /**
     * Create - Add a new employee
     * @param salle An object employee
     * @return The employee object saved
     */
    @PostMapping("/salle/new/")
    public Salle createSalle(@RequestBody Salle salle) {
        return salleService.saveSalle(salle);
    }


    /**
     * Update - Update an existing employee
     * @param salle - The employee object updated
     * @return
     */
    @PutMapping("/salle/{id}")
    public Salle updateSalle(@PathVariable("id") final Long id, @RequestBody Salle salle) {
        Optional<Salle> e = salleService.getSalle(id);

        if(e.isPresent()) {
            Salle currentSalle = e.get();

            String nom = salle.getNom();
            if(nom != null) {
                currentSalle.setNom(nom);
            }

            Long place = salle.getPlaces();
            if(place != null){
                currentSalle.setPlaces(place);
            }
            Type_Salle typeSalle = salle.getTypeSalle();
            if(typeSalle != null) {
                currentSalle.setTypeSalle(typeSalle);
            }
            salleService.saveSalle(currentSalle);

            return currentSalle;
        } else {
            return null;
        }


    }

    /**
     * Delete - Delete an employee
     * @param id_Type_Salle - The id of the salle to delete
     */
    @DeleteMapping("/salle/delete/{id_Type_Salle}")
    public void deleteSalle(@PathVariable("id_Type_Salle") final Long id_Type_Salle) {
        salleService.deleteSalle(id_Type_Salle);
    }

}
