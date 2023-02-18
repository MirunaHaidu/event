package event.demo.controller;

import event.demo.dto.EventCreateDto;
import event.demo.dto.EventInfoDto;
import event.demo.service.EventService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/event")
public class EventController {
    private final EventService eventService;

@Autowired
    public EventController(EventService eventService) {
        this.eventService = eventService;
    }
    @PostMapping("/create")
    public ResponseEntity<EventInfoDto> createEvent(@RequestBody @Valid EventCreateDto eventCreateDto){
        return ResponseEntity.ok(eventService.createEvent(eventCreateDto));
    }
}
