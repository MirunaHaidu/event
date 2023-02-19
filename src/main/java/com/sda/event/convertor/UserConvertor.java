package com.sda.event.convertor;

import com.sda.event.dto.UserCreateDto;
import com.sda.event.dto.UserInfoDto;
import com.sda.event.model.User;

public class UserConvertor {
    public static User createDtoToEntity(UserCreateDto userCreateDto){
        User user = new User();
        user.setName(userCreateDto.getName());
        user.setEmail(userCreateDto.getEmail());
        user.setPassword(userCreateDto.getPassword());
        return user;
    }

    public static UserInfoDto entityToInfoDto(User user){
        UserInfoDto userInfoDto = new UserInfoDto();
        userInfoDto.setName(user.getName());
        userInfoDto.setEmail(user.getEmail());
//        userInfoDto.setPassword(user.getPassword());
        return userInfoDto;
    }
}
