package org.example.day6;

public class AppHero {
    public static void main(String[] args) {
        Hero hero = new Hero("Айвенго");
        System.out.println("Добро пожаловать " + hero.getName());
        System.out.println("Начальный уровень: " + hero.getLevel());
        System.out.println("Начальное здоровье: " + hero.getHealthPoints());
        System.out.println("Начальный опыт: " + hero.getExperiencePoints());
        System.out.println(hero);

        Monster goblin = new Monster(20, 300);
        Monster skeleton = new Monster(30, 500);
        Monster troll = new Monster(40, 800);
        Monster ogre = new Monster(50, 1200);

        hero.fightMonster(goblin);
        hero.fightMonster(skeleton);
        hero.fightMonster(troll);
        hero.fightMonster(ogre);


        System.out.println("Итоговый уровень: " + hero.getLevel());
        System.out.println("Итоговое здоровье: " + hero.getHealthPoints());
        System.out.println("Итоговый опыт: " + hero.getExperiencePoints());
    }
}