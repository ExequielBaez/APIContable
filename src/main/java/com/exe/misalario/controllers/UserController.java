package com.exe.misalario.controllers;

import com.exe.misalario.persistence.entities.UserEntity;
import com.exe.misalario.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<UserEntity>> getListUser(){
        return ResponseEntity.ok(userService.getAllUsers());

    }
}
