package day7;

class RaceCar {
    private String brand;
    private String model;
    private double fuelLevel;
    private double condition;

    public RaceCar(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.fuelLevel = 100;
        this.condition = 100;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public double getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public void refuel() {
        System.out.println(brand + " " + model + ": Заправка...");
    }

    public void service() {
        System.out.println(brand + " " + model + ": Обслуживание...");
    }

    public void testDrive() {
        System.out.println(brand + " " + model + ": Тест-драйв...");
    }

    @Override
    public String toString() {
        return "RaceCar{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", fuelLevel=" + fuelLevel +
                ", condition=" + condition +
                '}';
    }
}

