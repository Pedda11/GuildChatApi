package com.example.demo_peter.services;

import com.example.demo_peter.entities.InfoChatEntry;
import com.example.demo_peter.entities.ShoutBoxEntry;
import com.example.demo_peter.repositories.InfoChatRepository;
import com.example.demo_peter.repositories.ShoutboxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InfoChatService {

    @Autowired
    private InfoChatRepository infoChatRepository;

    public List<InfoChatEntry> getAll() {
        return infoChatRepository.findAll();
    }

    public void insertEntry(InfoChatEntry infoChatEntry) {
        infoChatRepository.save(infoChatEntry);
    }

}
