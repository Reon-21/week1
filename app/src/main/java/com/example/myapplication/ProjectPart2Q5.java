package com.example.myapplication;

import java.util.Scanner;

public class ProjectPart2Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();
        computeProduct(firstNumber, secondNumber);

    }

    public static void computeProduct(int first, int second) {
        if (10 <= first && first <=50 && 10<= second && second<=50){
            int product = first * second;
            System.out.println("The product " + first + " and " + second + " is " +product);

        }
        else
            System.out.println("Not in range");
    }

}
