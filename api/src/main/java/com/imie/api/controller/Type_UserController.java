package com.imie.api.controller;

import com.imie.api.model.Type_User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.imie.api.service.Type_UserService;

@RestController
public class Type_UserController {

    @Autowired
    private Type_UserService type_UserService;


    @GetMapping("/type")
    public Iterable<Type_User> getType_User() {
        return type_UserService.getType_User();
    }
}
