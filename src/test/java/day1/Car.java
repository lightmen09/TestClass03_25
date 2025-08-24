package day1;

public class Car {
    String brand;
    int year;

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 2020);
        Car car2 = new Car("BMW", 2022);

        System.out.println("Car 1: " + car1.brand + ", " + car1.year);
        System.out.println("Car 2: " + car2.brand + ", " + car2.year);
    }
}
