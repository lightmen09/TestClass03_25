package org.example.day5;

public class Hero {
    private String name;
    private int healthPoints;
    private int level;
    private int experiencePoints;

    public Hero(String name) {
        this.name = name;
        this.healthPoints = 100;
        this.level = 1;
        this.experiencePoints = 0;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getLevel() {
        return level;
    }

    public int getExperiencePoints() {
        return experiencePoints;
    }

    public void takeDamage(int amount) {
        this.healthPoints -= amount;
        //System.out.println(name + "получил урон" + amount + ", осталось Здоровья " + this.healthPoints);
        System.out.println(String.format("%s получил урон %d , осталось Здоровья %d", name, amount, this.healthPoints));
        if (this.healthPoints <= 0) {
            System.out.println(name + " пал в бою!");
        }
    }

    public void gainExperiencePoints(int points) {
        this.experiencePoints += points;
        System.out.println(name + " получил опыт" + points + " Текущий опыт " + this.experiencePoints);
        checkLevelUp();
    }

    private void checkLevelUp() {
        if (this.experiencePoints > this.level * 1000) {
            level++;
            System.out.println(name + " Повысил уровень! Новый уровень " + level);
        }
    }

    public void fightMonster(Monster monster) {
        System.out.println(name + " Сражается с монстром");
        takeDamage(monster.getDamage());
        if (healthPoints > 0) {
            gainExperiencePoints(monster.getExperience());
        }
    }
}
     class Monster {
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


//    @Override
//    public String toString() {
//        return "Hero{" +
//                "name='" + name + '\'' +
//                ", healthPoints=" + healthPoints +
//                ", level=" + level +
//                ", experiencePoints=" + experiencePoints +
//                '}';
//    }





