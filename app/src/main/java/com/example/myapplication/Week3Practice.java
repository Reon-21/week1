package com.example.myapplication;

import java.util.Scanner;

public class Week3Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();
        if (secondNumber > firstNumber) {
            System.out.print("The second number is greater");
        }
        else{
            System.out.print("The first number is greater");

        }
    }
}
