package com.example.demo_peter.controller;

import com.example.demo_peter.services.ShoutboxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {

    @Autowired
    private ShoutboxService shoutboxService;


    
    @GetMapping("/insert")
    public String getIndex() {

        /*long timeSpan = java.time.Instant.now().getEpochSecond();

        ShoutBoxEntry entry = new ShoutBoxEntry();
        entry.setId(121);
        entry.setUserId(1);
        entry.setDate(timeSpan);
        entry.setText("another test");

        shoutboxService.insertEntry(entry);*/

        return "index";
    }

    @GetMapping("/pwtest")
    public String testStuff() {

        return "test";
    }

    @PostMapping("/pwtest")
    public String testStuff(@RequestParam("pw") String pw) {

        System.out.println(pw);

        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

        String encoded = passwordEncoder.encode(pw);

        System.out.println(encoded);

        return "test";
    }

    @GetMapping("/error")
    public String returnError() {
        return "error";
    }
    
}
