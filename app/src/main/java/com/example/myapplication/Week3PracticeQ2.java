package com.example.myapplication;

import java.util.Scanner;

public class Week3PracticeQ2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();
        System.out.print("Counting : ");
        for (int i = firstNumber; i >= secondNumber ; i--) {
            System.out.print(i + " ");
        }
    }
}
