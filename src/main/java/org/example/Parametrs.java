package org.example;

public class Parametrs {


    public static void main(String[] args) {
        int myNumber = 10;
        StringBuilder myText = new StringBuilder("Hello");

        System.out.println("До : myNumber = " + myNumber + ", myText = " + myText);

        changePrimitive(myNumber);
        changeReference(myText);

        System.out.println("После : myNumber = " + myNumber + ", myText = " + myText);
    }
    public static void changePrimitive(int number) {
        number += 10;
        System.out.println("Внутри changePrimitive: " + number);
    }

    public static void changeReference(StringBuilder text) {
        text.append(" world");
        System.out.println("Внутри changeReference: " + text);
    }
}
