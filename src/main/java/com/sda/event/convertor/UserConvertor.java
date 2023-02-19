package com.sda.event.convertor;

import com.sda.event.dto.UserCreateDto;
import com.sda.event.dto.UserInfoDto;
import com.sda.event.model.User;

public class UserConvertor {

    public static User createDtoToEntity(UserCreateDto userCreateDto){
        User user = new User();
        user.setEmail(userCreateDto.getEmail());
        user.setName(userCreateDto.getName());
        user.setPassword(userCreateDto.getPassword());

        return  user;
    }

    public static UserInfoDto entityToInfoDto(User user){
        UserInfoDto userInfoDto = new UserInfoDto();
        userInfoDto.setEmail(user.getEmail());
        userInfoDto.setName(user.getName());
        userInfoDto.setPassword(user.getPassword());
        userInfoDto.setId(user.getId());

        return userInfoDto;
    }
}
