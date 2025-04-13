package org.example.day2;

public class CalculateSum {
    public static int calculateSum(int a, int b) {
        return a + b;
    }

    public static double calculateSum(double a, double b) {
        return a + b;
    }
    public static void main(String[] args) {

        int sumInt = calculateSum(1, 11);
        System.out.println("Сумма целых чисел: " + sumInt);

        double sumDouble = calculateSum(3.22, 2.33);
        System.out.println("Сумма дробных чисел: " + sumDouble);
    }
}
