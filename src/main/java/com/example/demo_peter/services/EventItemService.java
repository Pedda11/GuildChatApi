package com.example.demo_peter.services;

import com.example.demo_peter.entities.EventItem;
import com.example.demo_peter.repositories.EventItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventItemService {

    @Autowired
    private EventItemRepository eventItemRepository;

    public List<EventItem> getAll() {
        return eventItemRepository.findAll();
    }

}
