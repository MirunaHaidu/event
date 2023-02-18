package com.sda.event.service.impl;

import com.sda.event.dto.EventCreateDto;
import com.sda.event.exception.EventException;
import com.sda.event.repository.EventRepository;
import com.sda.event.convertor.EventConvertor;
import com.sda.event.dto.EventInfoDto;
import com.sda.event.model.Event;
import com.sda.event.service.EventService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("test_qualifier_eventServiceImpl")
public class EventServiceImpl implements EventService {

    private final EventRepository eventRepository;

    public EventServiceImpl(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Override
    public EventInfoDto createEvent(EventCreateDto eventCreateDto) {
        return EventConvertor.entityToInfoDto(eventRepository.save(EventConvertor.createDtoToEntity(eventCreateDto)));
    }

    @Override
    public List<EventInfoDto> getAllEvents() {
        List<EventInfoDto> eventInfoDto = new ArrayList<>();
        eventRepository.findAll().forEach(event -> eventInfoDto.add(EventConvertor.entityToInfoDto(event)));
        return eventInfoDto;
    }

    @Override
    public EventInfoDto findEventByTitle(String title) {
        Event event = eventRepository.findByTitle(title)
                .orElseThrow(()-> new EventException("Event with title" + title+" not found"));

        return EventConvertor.entityToInfoDto(event);
    }


}
