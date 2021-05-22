package com.example.myapplication;

import java.util.Scanner;

public class ProjectPart2Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of IPads: ");
        int iPad = scanner.nextInt();
        calculatePrice(iPad);

    }
    public static void calculatePrice(int first) {
        int price = first * 1000;
        System.out.println("The total cost of the iPads is $" + price);

    }
}
