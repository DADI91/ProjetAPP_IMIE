package com.imie.api.controller;


import com.imie.api.model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.imie.api.service.UtilisateurService;

import java.util.Optional;

@RestController
public class UtilisateurController {

    @Autowired
    private UtilisateurService utilisateurService;

    /**
     * Read - Get all employees
     * @return - An Iterable object of Utilisateur full filled
     */
    @GetMapping("/utilisateurs")
    public Iterable<Utilisateur> getUtilisateur() {
        return utilisateurService.getUtilisateur();
    }


    @GetMapping("/utilisateur/{id}")
    public Utilisateur getUtilisateur(@PathVariable("id") final Long IdUtilisateur) {
        Optional<Utilisateur> utilisateur = utilisateurService.getUtilisateur(IdUtilisateur) ;
        if(utilisateur.isPresent()) {
            return utilisateur.get();
        } else {
            return null;
        }
    }
}
