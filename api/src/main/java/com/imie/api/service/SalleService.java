package com.imie.api.service;

import com.imie.api.model.Salle;
import com.imie.api.repository.SalleRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class SalleService {

    @Autowired
    private SalleRepository salleRepository;

    public Iterable<Salle> getSalle() {return salleRepository.findAll();}

    public Optional<Salle> getSalle(Long idSalle){ return salleRepository.findById(idSalle);}

    public void deleteSalle(final Long id){
        salleRepository.deleteById(id);
    }

    public Salle saveSalle(Salle salle){
        Salle savedSalle = salleRepository.save(salle);
        return savedSalle;
    }
}
