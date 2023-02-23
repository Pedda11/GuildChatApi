package com.example.demo_peter.services;

import com.example.demo_peter.entities.Event;
import com.example.demo_peter.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    public List<Event> getAll() {
        return eventRepository.findAll();
    }

    public List<Event> getComingEvents(){

        long secondsSinceEpoch = java.time.Instant.now().getEpochSecond();

        List<Event> events = new ArrayList<Event>();

        for (Event e : getAll()) {
            if (e.getTsEnd() >= secondsSinceEpoch){
                events.add(e);
            }
        }
        return events;
    }
}
