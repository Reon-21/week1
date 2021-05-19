package com.example.myapplication;

import java.util.Scanner;

public class ProjectPart2Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();
        System.out.print("Enter third number: ");
        int thirdNumber = scanner.nextInt();

        if (firstNumber < secondNumber && firstNumber < thirdNumber){
            System.out.println("The smaller number is " + firstNumber);
        }
        else if (secondNumber < thirdNumber && secondNumber < firstNumber){
            System.out.println("The smaller number is " + secondNumber);

        }
        else{
            System.out.println("The smaller number is " + thirdNumber);


        }


    }


}


