package com.example.demo_peter.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Table(name = "eqdkp23_shoutbox")
@Entity
public class ShoutBoxEntry {

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
