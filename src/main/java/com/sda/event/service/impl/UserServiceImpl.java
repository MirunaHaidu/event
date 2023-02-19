package com.sda.event.service.impl;

import com.sda.event.convertor.UserConvertor;
import com.sda.event.dto.UserCreateDto;
import com.sda.event.dto.UserInfoDto;
import com.sda.event.repository.EventRepository;
import com.sda.event.repository.UserRepository;
import com.sda.event.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final EventRepository eventRepository;

    public UserServiceImpl(UserRepository userRepository, EventRepository eventRepository) {
        this.userRepository = userRepository;
        this.eventRepository = eventRepository;
    }

    @Override
    public UserInfoDto createNewUser(UserCreateDto userCreateDto) {
        return UserConvertor.entityToInfoDto(userRepository.save(UserConvertor
                .createDtoToEntity(userCreateDto)));
    }

    @Override
    public List<UserInfoDto> getAllUsers() {
        List<UserInfoDto> userInfoDto = new ArrayList<>();
        userRepository.findAll().forEach(user -> userInfoDto.add(UserConvertor
                .entityToInfoDto(user)));


        return userInfoDto;
    }
}
