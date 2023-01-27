package com.example.skyprojunit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UserTest {
    //  два теста по первому заданию, первый решил попробовать через toString, второй как посоветовал Лёша на вебинаре
    @Test
    @DisplayName("When User class instance is created with 2 parameters then same values are given to the fields of instance")
    void correctFieldValuesTest() {
        User actual = new User("testLogin", "test@test.com");
        assertEquals(actual.toString(), new User("testLogin", "test@test.com").toString());
    }

    @Test
    @DisplayName("When User class instance is created with 2 parameters then same values are returned by getters from the fields of instance")
    void correctValuesFromGettersTest() {
        User actual = new User("testLogin", "test@test.com");
        assertEquals(actual.getLogin() + ": " + actual.getEmail(), "testLogin: test@test.com");

    }

    @Test
    void nullLoginTest() {
        User actual = new User(null, null);
        assertNotNull(actual.getLogin());
    }

    @Test
    void nullEmailTest() {
        User actual = new User(null, null);
        assertNotNull(actual.getEmail());
    }

    @Test
    void correctEmailFormatTest() {
        User actual = new User("testLogin", "test@test.com");
        assertEquals(actual.getEmail().contains("@") && actual.getEmail().contains("."), true);
    }
}
