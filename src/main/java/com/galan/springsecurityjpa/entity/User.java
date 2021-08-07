package com.galan.springsecurityjpa.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "User")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;

    private String userName;
    private String password;
    private boolean active;
    private String roles;
}
