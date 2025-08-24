package day5.part1;

public class CruiseLainer {
    private String name;
    private int speed;
    private double champagneStock;

    public CruiseLainer(String name, int speed, double champagneStock) {
        this.name = name;
        this.speed = speed;
        this.champagneStock = champagneStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getChampagneStock() {
        return champagneStock;
    }

    public void setChampagneStock(double champagneStock) {
        this.champagneStock = champagneStock;
    }

    public void printInfo() {
        System.out.println("Название лайнера: " + name + ", Текущая скорость: " + speed);
    }

    public void throwParty(int guests) {
        double champagneConsumed = guests * 0.2;
        System.out.println("Устроена вечеринка, гости выдули " + champagneConsumed + " литров шампанского");
    }
}
