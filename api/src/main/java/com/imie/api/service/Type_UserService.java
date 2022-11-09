package com.imie.api.service;


import lombok.Data;
import com.imie.api.model.Type_User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imie.api.repository.Type_UserRepository;

@Data
@Service
public class Type_UserService {

    @Autowired
    private Type_UserRepository type_UserRepository;


    public Iterable<Type_User> getType_User() {
        System.out.print(type_UserRepository.findAll());
        return type_UserRepository.findAll();
    }
}
