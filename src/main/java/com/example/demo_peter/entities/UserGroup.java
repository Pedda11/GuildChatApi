package com.example.demo_peter.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Table(name = "eqdkp23_groups_users")
@Entity
@IdClass(CompositeKey.class)
public class UserGroup {

    @Id
    @Column(name = "user_id")
    private int userId;

    @Id
    @Column(name = "group_id")
    private int groupId;

    @Column(name = "grpleader")
    private int isLeader;
}

class CompositeKey implements Serializable {
    private int userId;
    private int groupId;
}
