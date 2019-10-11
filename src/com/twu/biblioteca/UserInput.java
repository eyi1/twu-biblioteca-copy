package com.twu.biblioteca;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {

    public static String userSelection(String prompt) {
        Scanner s = new Scanner(System.in);
        System.out.println(prompt); //prompt
        String message = s.nextLine();
        System.out.println(message);
        return message;
    }
}