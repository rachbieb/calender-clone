package com.example.calenderclone.services;

import com.example.calenderclone.model.Event;
import com.example.calenderclone.repository.EventRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EventService {
    private final EventRepository repository;

    public EventService(EventRepository repository) {
        this.repository = repository;
    }

    public List<Event> getAllEvents() {
        return repository.findAll();
    }

    public Event addEvent(Event event) {
        return repository.save(event);
    }

    public Event updateEvent(Long id, Event updatedEvent) {
        return repository.findById(id)
                .map(e -> {
                    e.setTitle(updatedEvent.getTitle());
                    e.setDescription(updatedEvent.getDescription());
                    e.setDate(updatedEvent.getDate());
                    e.setTime(updatedEvent.getTime());
                    e.setCalendarType(updatedEvent.getCalendarType());
                    e.setAllDay(updatedEvent.isAllDay());
                    return repository.save(e);
                }).orElseThrow(() -> new RuntimeException("Event not found"));
    }

    public void deleteEvent(Long id) {
        repository.deleteById(id);
    }
}
