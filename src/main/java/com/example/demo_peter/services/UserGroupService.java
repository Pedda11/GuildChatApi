package com.example.demo_peter.services;

import com.example.demo_peter.entities.UserGroup;
import com.example.demo_peter.repositories.UserGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserGroupService {

    @Autowired
    private UserGroupRepository userGroupRepository;

    public List<UserGroup> getAll() {
        return userGroupRepository.findAll();
    }
}
