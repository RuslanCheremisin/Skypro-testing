package com.example.skyprojunit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    @DisplayName("When User class instance is created with 2 parameters then same values are returned by getters from the fields of instance")
    void correctValuesFromGettersTest() {
        User actual = new User("testLogin", "test@test.com");
        assertAll(() -> assertEquals(actual.getLogin(), "testLogin"),
                () -> assertEquals(actual.getEmail(), "test@test.com"));

    }

    @Test
    void nullLoginAndEmailTest() {
        User actual = new User(null, null);
        assertAll(() -> assertNotNull(actual.getEmail()),
                () -> assertNotNull(actual.getLogin()));
    }

    @Test
    void correctEmailFormatTest() {
        User actual = new User("testLogin", "test@test.com");
        assertAll(()->assertEquals(actual.getEmail().contains("@"), true),
                ()->assertEquals(actual.getEmail().contains("."), true));
    }
}
