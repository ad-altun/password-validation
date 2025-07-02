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

    // validation test to check both uppercase and lowercase
    // letters appear in the password
    @Test
    void validateLetterCase_shouldReturnFalse_whenPasswordHasNoLetter() {
        String password = "123*/-+";
        boolean expected = false;
        boolean actual = Main.validateLetterCase(password);
        assertEquals(expected, actual);
    }

    @Test
    void validateLetterCase_shouldReturnFalse_whenPasswordHasOnlyLowerCase() {
        String password = "abc";
        boolean expected = false;
        boolean actual = Main.validateLetterCase(password);
        assertEquals(expected, actual);
    }

    @Test
    void validateLetterCase_shouldReturnFalse_whenPasswordHasOnlyUpperCase() {
        String password = "ABC";
        boolean expected = false;
        boolean actual = Main.validateLetterCase(password);
        assertEquals(expected, actual);
    }

    @Test
    void validateLetterCase_shouldReturnTrue_whenPasswordHasBothUpperAndLowerCase() {
        String password = "abc123*ABC";
        boolean expected = true;
        boolean actual = Main.validateLetterCase(password);
        assertEquals(expected, actual);
    }

    @Test
    void validateUncommonPassword_shouldReturnTrue_whenPasswordCommon1() {
        String password = "password";

        boolean expected = true;
        boolean actual = Main.validateUncommonPassword(password);
    }

    @Test
    void validateUncommonPassword_shouldReturnTrue_whenPasswordCommon2() {
        String password = "ninja";

        boolean expected = true;
        boolean actual = Main.validateUncommonPassword(password);
    }

    @Test
    void validateUncommonPassword_shouldReturnFalse_whenPasswordCommon3() {
        String password = "password123*/-PASS";

        boolean expected = false;
        boolean actual = Main.validateUncommonPassword(password);
    }

}