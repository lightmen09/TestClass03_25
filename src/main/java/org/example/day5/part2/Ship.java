package org.example.day5.part2;

class Ship {
    private String name;
    private double speed;

    public Ship(String name, double speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void printInfo() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return String.format("Корабль '%s', скорость: %.1f узлов", name, speed);
    }
}
