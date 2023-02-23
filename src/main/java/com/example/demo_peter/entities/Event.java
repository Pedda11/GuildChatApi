package com.example.demo_peter.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.GeneratedValue;


@Getter
@Setter
@Table(name = "eqdkp23_calendar_events")
@Entity
public class Event {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private int id;

    @Column(name = "cloneid")
    private int cloneId;

    @Column(name = "calendar_id")
    private int calendarId;

    @Column(name = "name")
    private String name;

    @Column(name = "creator")
    private String creator;

    @Column(name = "timestamp_start")
    private long tsStart;

    @Column(name = "timestamp_end")
    private long tsEnd;

    @Column(name = "allday")
    private boolean allDay;

    @Column(name = "private")
    private boolean isPrivate;

    @Column(name = "visible")
    private boolean isVisible;
    
    @Column(name = "closed")
    private boolean isClosed;

    @Column(name = "extension")
    private String extension;

    @Column(name = "notes")
    private String notes;

    @Column(name = "repeating")
    private boolean isRepeating;

    @Column(name = "timezone")
    private String timeZone;

}
