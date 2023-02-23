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
@Table(name = "eqdkp23_groups_users")
@Entity
public class UserGroup {

    @Id
    @Column(name = "user_id")
    private int userId;

    @Column(name = "group_id")
    private int groupId;

    @Column(name = "grpleader")
    private int isLeader;
}
