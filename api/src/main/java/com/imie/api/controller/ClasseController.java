package com.imie.api.controller;

import com.imie.api.model.Classe;
import com.imie.api.repository.ClasseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/classes")
public class ClasseController {

    @Autowired
    private ClasseRepository classeRepository;

    @GetMapping
    public Iterable<Classe> getAllClasses() {
        return classeRepository.findAll();
    }

    @GetMapping("/{id}")
    public Classe getClasse(@PathVariable Long id) {
        return classeRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Classe createClasse(@RequestBody Classe classe) {
        return classeRepository.save(classe);
    }

    @PutMapping("/{id}")
    public Classe updateClasse(@PathVariable Long id, @RequestBody Classe classe) {
        Classe existingClasse = classeRepository.findById(id).orElse(null);
        if (existingClasse != null) {
            classe.setIdClasse(id);
            return classeRepository.save(classe);
        } else {
            return null;
        }
    }

    @DeleteMapping("/{id}")
    public void deleteClasse(@PathVariable Long id) {
        classeRepository.deleteById(id);
    }
}
