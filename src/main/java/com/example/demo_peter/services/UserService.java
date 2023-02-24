package com.example.demo_peter.services;

import com.example.demo_peter.entities.Auth;
import com.example.demo_peter.entities.User;
import com.example.demo_peter.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.Collections.EMPTY_LIST;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAll() {
        return userRepository.findAll();
    }

    public User findUserByUsername(String username) {
        List<User> all = userRepository.findAll();
        for (User user : all) {
            if (user.getUserName().equals(username)) {
                return user;
            }
        }
        return null;
    }
}
