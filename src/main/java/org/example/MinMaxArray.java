package org.example;

import java.util.Random;

public class MinMaxArray {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random rand = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100) + 1;
        }
//        for (int i: numbers){
//            numbers[i] = rand.nextInt(100) + 1;
//        }
        int min = numbers[0];
        int max = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Massiv ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
