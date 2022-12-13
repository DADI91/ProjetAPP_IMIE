package com.imie.api.service;

import com.imie.api.model.Formation;
import com.imie.api.repository.FormationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormationService {

    @Autowired
    private FormationRepository formationRepository;

    public Iterable<Formation> getAllFormations() {
        return formationRepository.findAll();
    }

    public Formation getFormation(Long id) {
        return formationRepository.findById(id).orElse(null);
    }

    public Formation createFormation(Formation formation) {
        return formationRepository.save(formation);
    }

    public Formation updateFormation(Long id, Formation formation) {
        Formation existingFormation = formationRepository.findById(id).orElse(null);
        if (existingFormation != null) {
            formation.setIdFormation(id);
            return formationRepository.save(formation);
        } else {
            return null;
        }
    }

    public void deleteFormation(Long id) {
        formationRepository.deleteById(id);
    }
}