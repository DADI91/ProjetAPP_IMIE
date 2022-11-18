package com.imie.api.controller;

import com.imie.api.model.Formateur;
import com.imie.api.service.FormateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class FormateurController {

    @Autowired
    private FormateurService formateurService;

    @GetMapping("/formateurs")
    public Iterable<Formateur> getFormateur(){
        return formateurService.getFormateur();
    }

    @GetMapping("/formateur/{id}")
    public Formateur getFormateur(@PathVariable("id") final Long idFormateur){
        Optional<Formateur> formateur = formateurService.getFormateur(idFormateur);
        if(formateur.isPresent()){
            return  formateur.get();
        }else {
            return null;
        }

    }
}
