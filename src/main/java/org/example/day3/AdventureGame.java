package org.example.day3;

import java.util.Random;
import java.util.Scanner;

public class AdventureGame {
    public static void printHelloHero(String heroName) {
        System.out.println("Добро пожаловать, " + heroName + " !");
    }

    public static String challengeDragons(int dragonsCount) {
        return "Тебе предстоит победить " + dragonsCount + " драконов";
    }

    public static boolean fightDragon() {
        Random rand = new Random();
        return rand.nextBoolean();
    }

    public static void startAdventure() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите имя героя");
        String heroName = sc.nextLine();

        printHelloHero(heroName);
        int dragonsCount = new Random().nextInt(5) + 1;
        System.out.println(challengeDragons(dragonsCount));

        int dragonsDefeated = 0;
        for (int i = 1; i <= dragonsCount; i++) {
            System.out.println("Бой с драконом " + i + " ...");
            if (fightDragon()) {
                System.out.println("Дракон побежден");
                dragonsDefeated++;
            } else {
                System.out.println("герой побежден");
                System.out.println("конец");
                return;
            }
        }
        System.out.println("Все " + dragonsDefeated + " драконов победил");
    }

    public static void main(String[] args) {
        startAdventure();
    }
}
