package com.example.demo_peter.services;

import com.example.demo_peter.entities.ShoutBoxEntry;
import com.example.demo_peter.repositories.ShoutboxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoutboxService {

    @Autowired
    private ShoutboxRepository shoutboxRepository;

    public List<ShoutBoxEntry> getAll() {
        return shoutboxRepository.findAll();
    }

    public void insertEntry(ShoutBoxEntry shoutBoxEntry) {
        shoutboxRepository.save(shoutBoxEntry);
    }

}
