package org.example.day8;

public class TypeTrouble {
    public static void main(String[] args) {
        int i = 100;
        long l = i;

        double d = 42.5;
        int x = (int) d;

        long big = 1_000_000_000_000L;
        int small = (int) big;

        byte b = 10;
        b = (byte) (b + 1);

        Object obj = "123";
        Integer number = Integer.valueOf(obj.toString());

        printSum(5, (int) 10.5);
    }

    private static void printSum(int a, int b) {
        System.out.println("Sum: " +(a + b));
    }
}
