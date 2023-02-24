package com.example.demo_peter.services;

import com.example.demo_peter.entities.Auth;
import com.example.demo_peter.entities.User;
import com.example.demo_peter.repositories.AuthRepository;
import com.example.demo_peter.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AuthService {

    @Autowired
    private AuthRepository authRepository;

    private Auth getAuthByUsername(String username) {
        List<Auth> all = authRepository.findAll();
        for (Auth auth : all) {
            if (auth.getUserName().equals(username)) {
                return auth;
            }
        }
        return null;
    }

    public boolean authUser(String username, String password) {
        Auth auth = getAuthByUsername(username);
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

        if (auth == null) {
            return false;
        }

        return passwordEncoder.matches(password, auth.getUserPasswd());
    }

}
