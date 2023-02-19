package com.sda.event.convertor;

import com.sda.event.dto.EventCreateDto;
import com.sda.event.dto.EventInfoDto;
import com.sda.event.model.Event;

public class EventConvertor {

    public static Event createDtoToEntity(EventCreateDto eventCreateDto){
        Event event = new Event();
        event.setTitle(eventCreateDto.getTitle());
        event.setDate(eventCreateDto.getDate());
        event.setDescription(eventCreateDto.getDescription());
//        event.setCreatedBy(eventCreateDto.getCreatedBy());
        return event;
    }

    public static EventInfoDto entityToInfoDto(Event event){
        EventInfoDto eventInfoDto = new EventInfoDto();
        eventInfoDto.setTitle(event.getTitle());
        eventInfoDto.setDate(event.getDate());
        eventInfoDto.setDescription(event.getDescription());
//        eventInfoDto.setCreatedBy(event.getCreatedBy());
        return eventInfoDto;
    }

}
