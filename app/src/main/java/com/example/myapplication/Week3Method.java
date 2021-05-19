package com.example.myapplication;

import java.util.Scanner;

public class Week3Method {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first side: ");
        int firstSide = scanner.nextInt();
        System.out.print("Enter the second side: ");
        int secondSide = scanner.nextInt();
        System.out.print("Enter the third side: ");
        int thirdSide = scanner.nextInt();
        calculatePerimeter(firstSide, secondSide, thirdSide);
        checkTriangle(firstSide, secondSide, thirdSide);
        calculateArea(firstSide,secondSide,thirdSide);
    }

    public static void calculatePerimeter(int first, int second, int third) {
        int perimeter = first + second + third;
        System.out.println("The perimeter of the triangle is : " + perimeter + "m");

    }
    public static void  checkTriangle(int first, int second, int third){
        if (first == second && second==third) {
            System.out.println("This is an equilateral triangle");

        }else{
            System.out.println("This is not an equilateral triangle");
        }

    }
    public static void calculateArea(double first, double second, double third) {
        double s = (first + second + third)/2;
        double area = Math.sqrt(s*(s-first)*(s-second)*(s-third));
        System.out.println("The area of the triangle is : " + area + "meter square");
    }

}
