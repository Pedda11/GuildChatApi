package com.example.demo_peter.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "eqdkp23_events")
@Entity
public class EventItem {

    @Id
    @Column(name = "event_id")
    @GeneratedValue
    private int id;

    @Column(name = "event_name")
    private String title;

    @Column(name = "event_icon")
    private String icon;
}
