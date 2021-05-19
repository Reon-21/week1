package com.example.myapplication;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Week2a {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;

        System.out.println("a + b  = " + (a + b));
        System.out.println("a - b  = " + (a - b));
        System.out.println("a * b  = " + (a * b));
        System.out.println("b / a  = " + (b / a));
        System.out.println("b % a  = " + (b % a));
        System.out.println("c % a  = " + (c % a));
        System.out.println("a++  = " + (a++));
        System.out.println("b--  = " + (b--));

        //Check the difference in the d++ and ++d
        System.out.println("d++  = " + (d++));
        System.out.println("++d  = " + (++d));

        //Relational Operators
        a = 10;
        b = 20;

        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));
        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));
        System.out.println("b >= a = " + (b >= a));
        System.out.println(" b <= s = " + (b <= a));

        //Logical Operators
        boolean a1 = true;
        boolean b1 = false;

        System.out.println("a1 && b1 = " + (a1 && b1));
        System.out.println("a1 || b1 = " + (a1 || b1));
        System.out.println("!(a1 && b1) = " + !(a1 && b1));

        //Assignment Operators
        int x = 10;
        int y = 20;
        int z = 0;

        z = x + y;
        System.out.println("z = x + y = " + z);

        z += x;
        System.out.println("z += x = " + z);

        z -= x;
        System.out.println("z -= x " + z);

        z *= x;
        System.out.println("z *= x " + z);

        x = 10;
        z = 15;
        z /= a;
        System.out.println("z /= x = " + z);

        x = 10;
        z = 15;
        z %= x;
        System.out.println("c %= x = " + z);

        // If else clause
        int n = 10;
        if (n > 5) {
            System.out.println("X is greater than 5");
        } else if (x > 3) {
            System.out.println("X is not greater than 5");
        }

        //must do line for scanner
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter your year of birth: ");
        int age  = scanner.nextInt();
        System.out.println("Your age is " + (2021 - age));

    }
}