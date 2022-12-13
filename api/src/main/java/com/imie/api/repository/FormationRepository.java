package com.imie.api.repository;

import com.imie.api.model.Formation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormationRepository extends CrudRepository<Formation, Long> {

}