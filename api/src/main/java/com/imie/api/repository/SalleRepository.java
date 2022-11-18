package com.imie.api.repository;

import com.imie.api.model.Salle;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalleRepository extends CrudRepository<Salle, Long> {
}
