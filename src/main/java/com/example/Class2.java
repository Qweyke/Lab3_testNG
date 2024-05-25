package com.example;

import java.util.HashMap;
import java.util.Map;

public class Class2 {

    public static void main(String[] args) {
        Map<String, String> data_base = new HashMap<>();
        if (Register("Fred", "Fred1337", data_base)){
            LogIn(data_base, "Fred", "Fred1337");
        }
    }
    public static boolean Register(String username, String password, Map<String, String> base) {
        boolean upper_letter = password.matches(".*[A-ZА-ЯЁ]+.*");
        boolean digit = password.matches(".*[0-9]+.*");
        boolean no_digit = username.matches(".*[0-9]+.*");
        if (!(no_digit)) {
            if (upper_letter && digit && password.length() >= 6) {
                System.out.println("Registration successful!");
                base.put(username, password);
                return true;
            }
        }
        if (!upper_letter) System.out.println("Pls, add upper letters to your password");
        if (!digit) System.out.println("Pls, add digits to your password");
        if (no_digit) System.out.println("Pls, remove numbers from your nickname");
        if (password.length() < 6) System.out.println("Password must be longer than 5 characters");
        return false;
    }

    public static boolean LogIn(Map<String, String> base, String username, String password) {
        if (base.containsKey(username)) {
            String pass = base.get(username);
            if (pass.equals(password)) {
                System.out.println("You've logged in successfully!");
                return true;
            }
            else System.out.println("Incorrect password");

        }
        return false;
    }
}
