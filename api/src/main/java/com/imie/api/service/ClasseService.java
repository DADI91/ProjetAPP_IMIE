package com.imie.api.service;

import com.imie.api.model.Classe;
import com.imie.api.repository.ClasseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClasseService {

    @Autowired
    private ClasseRepository classeRepository;

    public Iterable<Classe> getAllClasses() {
        return classeRepository.findAll();
    }

    public Classe getClasse(Long id) {
        return classeRepository.findById(id).orElse(null);
    }

    public Classe createClasse(Classe classe) {
        return classeRepository.save(classe);
    }

    public Classe updateClasse(Long id, Classe classe) {
        Classe existingClasse = classeRepository.findById(id).orElse(null);
        if (existingClasse != null) {
            classe.setIdClasse(id);
            return classeRepository.save(classe);
        } else {
            return null;
        }
    }

    public void deleteClasse(Long id) {
        classeRepository.deleteById(id);
    }
}
