package com.example.myapplication;

public class ProjectPart2Q3 {
    public static void main(String[] args) {
        int numbers[] = new int[8];

        numbers[0] = 55;
        numbers[1] = 24;
        numbers[2] = 65;
        numbers[3] = 41;
        numbers[4] = 13;
        numbers[5] = 22;
        numbers[6] = 76;
        numbers[7] = 90;

        System.out.print("Numbers greater or equal than 55 are ");
        for (int i = 0; i < numbers.length; i++ )
            if (numbers[i] >= 55) {
                System.out.print(numbers[i] + " ");
            }

            System.out.println(" ");
    }
}
