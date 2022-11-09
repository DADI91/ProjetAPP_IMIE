package com.imie.api.repository;

import com.imie.api.model.Type_User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Type_UserRepository extends CrudRepository<Type_User, Long> {

}
