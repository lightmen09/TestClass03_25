package day4;

public class Pizza {
    String name;
    int diameter;
    boolean isVegetarian;

    
    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", diameter=" + diameter +
                ", isVegetarian=" + isVegetarian +
                '}';
    }

    public Pizza(String name, int diameter, boolean isVegetarian) {
        this.name = name;
        this.diameter = diameter;
        this.isVegetarian = isVegetarian;
    }

    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("Margarita", 20, true);

        Pizza pizza2 = new Pizza("Margarita", 20, false);

        System.out.println(pizza1);
        System.out.println(pizza2);
    }
}
