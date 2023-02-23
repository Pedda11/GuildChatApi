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
@Table(name = "eqdkp23_users")
@Entity
public class User {

    @Id
    @Column(name = "user_id")
    @GeneratedValue
    private int userId;

    @Column(name = "username")
    private String userName;

    @Column(name = "user_password")
    private String userPasswd;

    @Column(name = "user_login_key")
    private String userLoginKey;
}
