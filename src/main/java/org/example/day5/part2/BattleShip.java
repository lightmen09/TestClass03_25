package org.example.day5.part2;

class BattleShip extends Ship {
    private int gunCount;

    public BattleShip(String name, double speed, int gunCount) {
        super(name, speed);
        this.gunCount = gunCount;
    }

    public int getGunCount() {
        return gunCount;
    }

    public void setGunCount(int gunCount) {
        this.gunCount = gunCount;
    }

    public void fireGuns(int gunsCount) {
        System.out.println("Корабль ведет огонь из " + gunsCount + " орудий");
    }

    @Override
    public String toString() {
        return String.format("Линейный корабль '%s', скорость: %.1f узлов", getName(), getSpeed());
    }
}
