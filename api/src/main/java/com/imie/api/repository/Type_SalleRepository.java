package com.imie.api.repository;

import com.imie.api.model.Type_Salle;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Type_SalleRepository extends CrudRepository<Type_Salle, Long> {
}
