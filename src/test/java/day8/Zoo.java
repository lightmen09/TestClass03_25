package day8;

public class Zoo {
    public static void main(String[] args) {
        Animal animal1 = new Cat();
        Animal animal2 = new Dog();

        animal1.makeSound();
        animal2.makeSound();

        ((Cat) animal1).scratch();
        ((Dog) animal2).fetch();

        Cat cat = (Cat) animal1;

    }
}
