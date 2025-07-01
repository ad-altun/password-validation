package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    // validation tests for password length
    @Test
    void validateLength_shouldReturnFalse_whenLengthIs0() {
        int length = 0;
        boolean expected = false;
        boolean actual = Main.validateLength(length);
        assertEquals(expected, actual);
    }

    @Test
    void validateLength_shouldReturnFalse_whenLengthIs7() {
        int length = 7;
        boolean expected = false;
        boolean actual = Main.validateLength(length);
        assertEquals(expected, actual);
    }

    @Test
    void validateLength_shouldReturnTrue_whenLengthIs8() {
        int length = 8;
        boolean expected = true;
        boolean actual = Main.validateLength(length);
        assertEquals(expected, actual);
    }


    // validation tests to check if password has numerics
    @Test
    void validateHasNumeric_shouldReturnFalse_whenPasswordHasNoNumeric() {
        String password = "password";
        boolean expected = false;
        boolean actual = Main.validateHasNumeric(password);
        assertEquals(expected, actual);
    }

    @Test
    void validateHasNumeric_shouldReturnTrue_whenPasswordHasNumeric() {
        String password = "password123";
        boolean expected = true;
        boolean actual = Main.validateHasNumeric(password);
        assertEquals(expected, actual);
    }

}