package com.imie.api.controller;
import aj.org.objectweb.asm.Type;
import com.imie.api.model.Formation;
import com.imie.api.repository.FormationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.nio.file.AccessDeniedException;


@RestController
@RequestMapping("/formations")
public class FormationController {

    @Autowired
    private FormationRepository formationRepository;

    @GetMapping
    public Iterable<Formation> getAllFormations() {
        return formationRepository.findAll();
    }

    @GetMapping("/{id}")
    public Formation getFormation(@PathVariable Long id) {
        return formationRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Formation createFormation(@RequestBody Formation formation) {
        return formationRepository.save(formation);

    }

    @PutMapping("/{id}")
    public Formation updateFormation(@PathVariable Long id, @RequestBody Formation formation) {
        Formation existingFormation = formationRepository.findById(id).orElse(null);
        if (existingFormation != null) {
            formation.setIdFormation(id);
            return formationRepository.save(formation);
        } else {
            return null;
        }
    }

    @DeleteMapping("/{id}")
    public void deleteFormation(@PathVariable Long id) {
        formationRepository.deleteById(id);
    }
}
