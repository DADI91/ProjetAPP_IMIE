package com.imie.api.repository;

import com.imie.api.model.Formateur;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormateurRepository extends CrudRepository<Formateur, Long> {

}
