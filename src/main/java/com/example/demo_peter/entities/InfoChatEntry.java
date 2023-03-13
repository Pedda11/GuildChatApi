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
@Table(name = "eqdkp23_infochat")
@Entity
public class InfoChatEntry {

    @Id
    @Column(name = "shoutbox_id")
    private int id;

    @Column(name = "user_or_member_id")
    private int userId;

    @Column(name = "shoutbox_date")
    private long date;

    @Column(name = "shoutbox_text")
    private String text;

}
