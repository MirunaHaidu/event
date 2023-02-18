package com.sda.event.service;

import com.sda.event.dto.EventCreateDto;
import com.sda.event.dto.EventInfoDto;

import java.util.List;

public interface EventService {
    EventInfoDto createEvent(EventCreateDto eventCreateDto);
    List<EventInfoDto> getAllEvents();
    EventInfoDto findEventByTitle(String title);

}
