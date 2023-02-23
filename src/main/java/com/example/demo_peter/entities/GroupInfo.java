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
@Table(name = "eqdkp23_groups_user")
@Entity
public class GroupInfo {

    @Id
    @Column(name = "groups_user_id")
    @GeneratedValue
    private int groupId;

    @Column(name = "groups_user_name")
    private String groupName;

    @Column(name = "groups_user_desc")
    private String groupDesc;
}
