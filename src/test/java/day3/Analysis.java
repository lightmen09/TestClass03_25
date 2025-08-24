package day3;

import java.util.Scanner;

class MathOperations {
    public static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static int findMin(int[] numbers) {
        int min = numbers[0];
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public static double findAverage(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }

    public static long factor(int number) {
        if (number < 0){
            throw new IllegalArgumentException("Факториал не определен");
        }
        long result = 1;
        for (int i =1; i <= number; i++) {
            result *=i;
        }
        return result;
    }
    public static void factors(int[] numbers){
        for (int number :numbers) {
            System.out.println(number + "!=" + factor(number));
        }
    }

    public static void print(int[] numbers) {
        System.out.println("Минимальное " + findMin(numbers));
        System.out.println("Максимальное " + findMax(numbers));
        System.out.println("Среднее " + findAverage(numbers));
   //     System.out.println("Факториал" + );
        factors(numbers);
    }
}

public class Analysis{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Enter 5 numbers");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Numbers");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        MathOperations.print(numbers);
    }
}
