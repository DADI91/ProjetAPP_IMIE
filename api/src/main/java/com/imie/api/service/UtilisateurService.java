package com.imie.api.service;


import lombok.Data;
import com.imie.api.model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imie.api.repository.UtilisateurRepository;

import java.util.Optional;

@Data
@Service
public class UtilisateurService {
    @Autowired
    private UtilisateurRepository utilisateurRepository;


    public Iterable<Utilisateur> getUtilisateur() {
        System.out.print(utilisateurRepository.findAll());
        return utilisateurRepository.findAll();
    }

    public Optional<Utilisateur> getUtilisateur(Long IdUtilisateur) {
        return utilisateurRepository.findById(IdUtilisateur);
    }
}
