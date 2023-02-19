package com.sda.event.service;

import com.sda.event.dto.UserCreateDto;
import com.sda.event.dto.UserInfoDto;

import java.util.List;



public interface UserService {
    UserInfoDto createNewUser(UserCreateDto userCreateDto);
    List<UserInfoDto> getAllUsers();

}
