package com.example.demo_peter.controller;

import com.example.demo_peter.dtos.LoginInput;
import com.example.demo_peter.entities.*;
import com.example.demo_peter.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ApiController {

    @Autowired
    private ShoutboxService shoutboxService;
    @Autowired
    private InfoChatService infoChatService;
    @Autowired
    private EventService eventService;
    @Autowired
    private UserService userService;
    @Autowired
    private UserGroupService userGroupService;
    @Autowired
    private GroupInfoService groupInfoService;
    @Autowired
    private AuthService authService;

    // GET REQUESTS

    @RequestMapping(value = "/entries", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<ShoutBoxEntry> entries() {
        return shoutboxService.getAll();
    }

    @RequestMapping(value = "/infos", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<InfoChatEntry> infos() {
        return infoChatService.getAll();
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<User> users() {
        return userService.getAll();
    }

    @RequestMapping(value = "/groups", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<UserGroup> userGroups() {
        return userGroupService.getAll();
    }

    @RequestMapping(value = "/groupinfos", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<GroupInfo> groupInfos() {
        return groupInfoService.getAll();
    }

    @RequestMapping(value = "/events", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<Event> events() { return eventService.getAll(); }

    @RequestMapping(value = "/coming_events", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<Event> comingEvents() {
        return eventService.getComingEvents();
    }

    // POST REQUESTS

    @PostMapping("/entry")
    public ResponseEntity<String> createNewEntry(@RequestBody ShoutBoxEntry newEntry) {
        shoutboxService.insertEntry(newEntry);
        return new ResponseEntity<>("created \n", HttpStatus.CREATED);
    }

    @PostMapping("/auth")
    public ResponseEntity<User> authorizeUser(@RequestBody LoginInput loginInput) {
        boolean auth = authService.authUser(loginInput.getUsername(), loginInput.getPassword());
        if (auth) {
            User user = userService.findUserByUsername(loginInput.getUsername());
            return new ResponseEntity<>(user, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(new User(), HttpStatus.UNAUTHORIZED);
        }
    }

    // ERROR HANDLING

    @GetMapping("/error")
    public ResponseEntity<String> errorGet() {
        return new ResponseEntity<>("Bad Request \n", HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/error")
    public ResponseEntity<String> errorPost() {
        return new ResponseEntity<>("Bad Request \n", HttpStatus.BAD_REQUEST);
    }

    @PutMapping("/error")
    public ResponseEntity<String> errorPut() {
        return new ResponseEntity<>("Bad Request \n", HttpStatus.BAD_REQUEST);
    }

}
