package org.example.day2;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        if (number > 0 ) {
            System.out.println(number + "Положительное");
        }
        else if (number < 0) {
            System.out.println(number +"Отрицательное");
        }
        else {
            System.out.println("0");
        }

        boolean dividedBy2 = (number % 2 == 0);
        boolean dividedby3 = (number % 3 == 0);
        if (dividedBy2 && dividedby3) {
            System.out.println("делится на 2 и 3");
        }
        else if (dividedBy2) {
            System.out.println("делится на 2");
        }
        else if (dividedby3) {
            System.out.println("делится на 3");
        }
        else {
            System.out.println("Не делится на 2 и 3");
        }
    }
}
