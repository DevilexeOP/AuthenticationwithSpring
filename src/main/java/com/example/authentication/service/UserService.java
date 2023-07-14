package com.example.authentication.service;

import com.example.authentication.dto.UserDto;
import com.example.authentication.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);
    User findByEmail(String email);
    List<UserDto> findAllUsers();
}
