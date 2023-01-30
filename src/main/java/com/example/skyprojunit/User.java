package com.example.skyprojunit;

import java.util.Objects;

public class User {
    private String login;
    private String email;

    public User(String login, String email){
        this.login = login;
        this.email = email;
    }

    public User() {

    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
