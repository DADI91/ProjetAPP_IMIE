package com.imie.api.service;

import com.imie.api.model.Type_Salle;
import com.imie.api.repository.Type_SalleRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class Type_SalleService {

    @Autowired
    private Type_SalleRepository type_salleRepository;

    public Iterable<Type_Salle> getType_Salle(){
        return type_salleRepository.findAll();
    }

    public Optional<Type_Salle> getTypeSalle(Long idTypeSalle){ return type_salleRepository.findById(idTypeSalle);}

    public void deleteTypeSalle(final Long id){
        type_salleRepository.deleteById(id);
    }

    public Type_Salle saveTypeSalle(Type_Salle typeSalle){
        Type_Salle savedTypeSalle = type_salleRepository.save(typeSalle);
        return savedTypeSalle;
    }
}
