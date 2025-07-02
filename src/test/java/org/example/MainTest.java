package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    // validation tests for password length
    @Test
    void validateLength_shouldReturnFalse_whenLengthIs0() {
        String password = "";
        boolean expected = false;
        boolean actual = Main.validateLength(password);
        assertEquals(expected, actual);
    }

    @Test
    void validateLength_shouldReturnFalse_whenLengthIs7() {
        String password = "passwor";
        boolean expected = false;
        boolean actual = Main.validateLength(password);
        assertEquals(expected, actual);
    }

    @Test
    void validateLength_shouldReturnTrue_whenLengthIs8() {
        String password = "password";
        boolean expected = true;
        boolean actual = Main.validateLength(password);
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
    void validateHasNoCommonPassword_shouldReturnTrue_whenPasswordCommon1() {
        String password = "password";

        boolean expected = false;
        boolean actual = Main.validateHasNoCommonPassword(password);
        assertEquals(expected, actual);
    }

    @Test
    void validateHasNoCommonPassword_shouldReturnTrue_whenPasswordCommon2() {
        String password = "ninja";

        boolean expected = false;
        boolean actual = Main.validateHasNoCommonPassword(password);
        assertEquals(expected, actual);
    }

    @Test
    void validateHasNoCommonPassword_shouldReturnFalse_whenPasswordCommon3() {
        String password = "password123*/-PASS";

        boolean expected = true;
        boolean actual = Main.validateHasNoCommonPassword(password);
        assertEquals(expected, actual);
    }

    @Test
    void validateSpecialCharacter_shouldReturnFalse_whenNoSpecialCharacter() {
        String password = "password123";
        boolean expected = false;
        boolean actual = Main.validateSpecialCharacter(password);
        assertEquals(expected, actual);
    }

    @Test
    void validateSpecialCharacter_shouldReturnTrue_whenHasOnlySpecialCharacter() {
        String password = "#?!@";
        boolean expected = true;
        boolean actual = Main.validateSpecialCharacter(password);
        assertEquals(expected, actual);
    }

    @Test
    void validateSpecialCharacter_shouldReturnTrue_whenHasSpecialCharacter() {
        String password = "password#?!@123";
        boolean expected = true;
        boolean actual = Main.validateSpecialCharacter(password);
        assertEquals(expected, actual);
    }
}