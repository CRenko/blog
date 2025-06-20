package com.crk.backend.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    private int id;
    private String username;
    private String password;
    private String email;
    private String avatar;
    private String role;

    public User() {

    }

    public User(int id, String username, String password, String email, String avatar) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.avatar = avatar;
        this.role = "USER";
    }
}
