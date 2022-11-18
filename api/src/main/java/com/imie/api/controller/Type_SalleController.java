package com.imie.api.controller;

import com.imie.api.model.Salle;
import com.imie.api.model.Type_Salle;
import com.imie.api.service.Type_SalleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class Type_SalleController {
    @Autowired
    private Type_SalleService typeSalleService;

    @GetMapping("/typeSalles")
    public Iterable<Type_Salle> getTypeSalle(){
        return typeSalleService.getType_Salle();
    }


    @GetMapping("/typeSalle/{id}")
    public Type_Salle getSalle(@PathVariable("id") final Long idTypeSalle){
        Optional<Type_Salle> typeSalle = typeSalleService.getTypeSalle(idTypeSalle);
        if(typeSalle.isPresent()){
            return typeSalle.get();
        }else {
            return null;
        }
    }



     /**
     * Create - Add a new typeSalle
     * @param typeSalle An object typeSalle
     * @return The typeSalle object saved
     */
    @PostMapping("/typeSalle/new/")
    public Type_Salle createTypeSalle(@RequestBody Type_Salle typeSalle) {
        return typeSalleService.saveTypeSalle(typeSalle);
    }

    /**
     * Update - Update an existing employee
     * @param id - The employee object updated
     * @return
     */
    @PutMapping("/typeSalle/{id}")
    public Type_Salle updateSalle(@PathVariable("id") final Long id, @RequestBody Type_Salle typeSalle) {
        Optional<Type_Salle> e = typeSalleService.getTypeSalle(id);

        if(e.isPresent()) {
            Type_Salle currentTypeSalle = e.get();

            String type_salle = typeSalle.getType_Salle();
            if(type_salle != null) {
                currentTypeSalle.setType_Salle(type_salle);
            }
            typeSalleService.saveTypeSalle(currentTypeSalle);
            return currentTypeSalle;
        } else {
            return null;
        }


    }


    /**
     * Delete - Delete an type_salle
     * @param id_Type_Salle - The id of the type_salle to delete
     */
    @DeleteMapping("/typeSalle/delete/{id_Type_Salle}")
    public void deleteTypeSalle(@PathVariable("id_Type_Salle") final Long id_Type_Salle) {
        typeSalleService.deleteTypeSalle(id_Type_Salle);
    }






}
