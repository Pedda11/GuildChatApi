package com.example.demo_peter.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "eqdkp23_users")
@Entity
public class Auth {

    @Id
    @Column(name = "user_id")
    @GeneratedValue
    private int userId;

    @Column(name = "username")
    private String userName;

    @Column(name = "user_password")
    private String userPasswd;

}
