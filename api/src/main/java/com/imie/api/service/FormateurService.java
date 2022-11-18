package com.imie.api.service;

import com.imie.api.model.Formateur;
import com.imie.api.repository.FormateurRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class FormateurService {

    @Autowired
    private FormateurRepository formateurRepository;

    public Iterable<Formateur> getFormateur() {
        return formateurRepository.findAll();
    }

    public Optional<Formateur> getFormateur(Long idFormateur){
        return formateurRepository.findById(idFormateur);
    }
}
