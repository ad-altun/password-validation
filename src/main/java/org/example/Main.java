package org.example;

public class Main {

    public static void main(String[] args) {


    }

    public static boolean validateLength(int length) {
        return length >= 8;
    }

    // password.matches("^[A-Za-z0-9]*$")
    public static boolean validateHasNumeric(String password) {
        return password.matches(".*\\d.*");
    }

}