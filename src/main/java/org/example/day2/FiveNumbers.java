package org.example.day2;

import java.util.Scanner;

public class FiveNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("5 numbers: ");
        for (int num : numbers)
            System.out.print(num + " ");

        System.out.println();
        int firstCount = 0, secondCount = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                secondCount++;
            } else {
                firstCount++;
            }
        }
        System.out.println("Четн " + secondCount + " Нечетн " + firstCount);
    }
}
