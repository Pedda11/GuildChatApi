package com.example.demo_peter.services;

import com.example.demo_peter.entities.Event;
import com.example.demo_peter.entities.EventItem;
import com.example.demo_peter.repositories.EventItemRepository;
import com.example.demo_peter.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private EventItemRepository eventItemRepository;

    public List<Event> getAll() {
        return prepareData(eventRepository.findAll());
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

    private List<Event> prepareData(List<Event> events){
        List<EventItem> items = eventItemRepository.findAll();

        for (Event e : events) {
            for (EventItem i : items) {
                if (e.getId() == i.getId()){
                    e.setTitle(i.getTitle());
                    e.setIcon(i.getIcon());
                }
            }
        }

        return events;
    }
}
