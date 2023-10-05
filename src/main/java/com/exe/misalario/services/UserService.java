package com.exe.misalario.services;

import com.exe.misalario.persistence.entities.UserEntity;

import java.util.List;

public interface UserService {

    public List<UserEntity> getAllUsers();
}
