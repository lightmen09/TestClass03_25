package org.example.day4;

public class Receptionist {
    public void greeting() {
        System.out.println("Здравствуйте!");
    }
    public void greeting(String name) {
        System.out.println("Здравствуйте " + name +"!");
    }
    public void greeting(String name, int age) {
       boolean isOld = age > 50;
        String greet = isOld ? "Вам " : "Тебе ";
        System.out.println("Здравствуйте " + name + "! " + greet + age + " лет?");
    }
    public static void main(String[] args) {
        Receptionist receptionist = new Receptionist();

        receptionist.greeting();
        receptionist.greeting("Алиса");
        receptionist.greeting("Боб",45);
        receptionist.greeting("S",60);
    }
}
