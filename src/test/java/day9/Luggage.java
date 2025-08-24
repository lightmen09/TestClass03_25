package day9;

public class Luggage {
    private double weight;
    private String ownerFullName;
    private boolean inspected;

    public Luggage(double weight, String ownerFullName, boolean inspected) {
        this.weight = weight;
        this.ownerFullName = ownerFullName;
        this.inspected = inspected;
    }

    public String toString() {
        return String.format("[Owner: %s, Weight: %.2fkg, Inspected: %s]",
                ownerFullName, weight, inspected);
    }
}
