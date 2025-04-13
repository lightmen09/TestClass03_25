package org.example.day6;

public class Monster {
    private int damage;
    private int experience;

    public Monster(int damage, int experience) {
        this.damage = damage;
        this.experience = experience;
    }

    public int getDamage() {
        return damage;
    }

    public int getExperience() {
        return experience;
    }
}