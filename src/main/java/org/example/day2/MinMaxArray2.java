package org.example.day2;

import java.util.Random;

public class MinMaxArray2 {

    public static void main(String[] args) {
        int[] numbers = getRandomArray();
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

    public static int[] getRandomArray (){
        int[] array = new int[10];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100) + 1;
        }
        return array;
    }
}
