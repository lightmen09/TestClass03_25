package org.example.day2;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Имя: " + name + ", Возраст: " + age);
    }

    public void celebrateBirthday() {
        age++;
    }

    public static void main(String[] args) {
        Person person = new Person("V", 10);
        Person person2 = new Person("A",22);
        person.printInfo();
        person.celebrateBirthday();
        person.printInfo();
    }
}
