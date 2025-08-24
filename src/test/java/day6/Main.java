package day6;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", 120_000);
        Employee emp2 = new Employee();

        Developer dev1 = new Developer("Bob", 150_000, 200);
        Manager mgr1 = new Manager("Charlie", 200_000, 5);

        emp1.printInfo();
        emp2.printInfo();
        dev1.printInfo();
        mgr1.printInfo();
    }
}