package org.example;

import java.util.Scanner;

public class Main {

    public static final String[] commonPasswords = {"password", "123456", "abc123", "111111",
                                "123123", "ashley", "ninja"};

    public static void main(String[] args) {
        Scanner passwordScan = new Scanner(System.in);
        System.out.println("Please enter your password: ");

        String password = passwordScan.nextLine();

        if ( !validateLength(password) )
            System.out.println("- Password length should be at least 8 characters.");

        if ( !validateHasNumeric(password) )
            System.out.println("- Password should contain at least one digit.");

        if ( !validateLetterCase(password) )
            System.out.println("- Password should contain at least " +
                    "one uppercase and lowercase letters");

        if ( !validateHasNoCommonPassword(password) )
            System.out.println("- Sorry, your password is weak.");

        if ( !validateSpecialCharacter(password) )
            System.out.println("- Please use at least one special character.");
    }

    public static boolean validateLength(String password) {
        return password.length() >= 8;
    }

    // password.matches("^[A-Za-z0-9]*$")
    public static boolean validateHasNumeric(String password) {
        return password.matches(".*\\d.*");
    }

    public static boolean validateLetterCase(String password) {
        return password.matches("^(?=.*[a-z])(?=.*[A-Z]).+$");
    }


    public static boolean validateHasNoCommonPassword(String password) {
        for (String commonPassword : commonPasswords) {
            if (commonPassword.equals(password))
                return false;
        }
        return true;
    }

    public static boolean validateSpecialCharacter(String password) {
        return password.matches("^(?=.*[@?#*.=$%&!]).+$");
    }
}