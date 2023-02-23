package com.example.demo_peter.controller;

import com.example.demo_peter.entities.*;
import com.example.demo_peter.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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
}
