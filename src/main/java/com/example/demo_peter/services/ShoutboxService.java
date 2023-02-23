package com.example.demo_peter.services;

import com.example.demo_peter.entities.ShoutBoxEntry;
import com.example.demo_peter.repositories.ShoutboxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

@Service
public class ShoutboxService {

    @Autowired
    private ShoutboxRepository shoutboxRepository;

    public List<ShoutBoxEntry> getAll() {
        return shoutboxRepository.findAll();
    }

    public void insertEntry(ShoutBoxEntry shoutBoxEntry) {
        shoutBoxEntry.setId(generateId());
        shoutboxRepository.save(shoutBoxEntry);
    }

    public int generateId() {
        List<ShoutBoxEntry> all = shoutboxRepository.findAll();

        List<Integer> allIds = new ArrayList<Integer>();
        for (ShoutBoxEntry entry : all) {
            allIds.add(entry.getId());
        }

        Collections.sort(allIds);
        int max = allIds.get(allIds.size()-1);
        return max+1;
    }

}
