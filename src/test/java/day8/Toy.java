package day8;

class Toy extends Product {
    public Toy(String name, double price) {
        super(name, price);
    }

    @Override
    public void printDeliveryInfo() {
        System.out.println(name + ": Перевязано красной ленточкой. Всё.");
    }
}
