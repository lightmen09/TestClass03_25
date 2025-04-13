package org.example.day6.part1;

public class BattleShip {
    private String name;
    private int speed;
    private int artilleryGunsCount;

    public BattleShip(String name, int speed, int artilleryGunsCount) {
        this.name = name;
        this.speed = speed;
        this.artilleryGunsCount = artilleryGunsCount;
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

    public int getArtilleryGunsCount() {
        return artilleryGunsCount;
    }

    public void setArtilleryGunsCount(int artilleryGunsCount) {
        this.artilleryGunsCount = artilleryGunsCount;
    }

    public void printInfo() {
        System.out.println("Название корабля: " + name + ", Текущая скорость: " + speed );
    }

    public void fireGuns(int gunsCount) {
        System.out.println("Корабль ведет огонь из " + gunsCount + " орудий");
    }
}
