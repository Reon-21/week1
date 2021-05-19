package com.example.myapplication;

import java.util.Scanner;

public class TestLogin {
    public static void main(String[] args) {
        boolean login = false;
        String password = "mypass";
        System.out.println("Enter password: ");
        Scanner scanner = new Scanner (System.in);
        String input = scanner.nextLine();

        if (input.equals(password)) {
            login = true;
            System.out.println("Login success = " + login);
        }
        else{
            System.out.println("Login success = " + login);
        }
    }



}

