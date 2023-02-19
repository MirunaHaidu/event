package com.sda.event.service;

import com.sda.event.dto.UserCreateDto;
import com.sda.event.dto.UserInfoDto;

import com.sda.event.model.User;


import java.util.List;



public interface UserService {


    UserInfoDto registerUser(UserCreateDto userCreateDto);
    List<UserInfoDto> getAllUsers();
//    void saveUser(User user);

    User findByEmail(String email);

}

