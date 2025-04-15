package org.example.day5.part2;

public class SeaTransportApp {
    public static void main(String[] args) {
        BattleShip[] battleShips = {
                new BattleShip("Бык", 30.5, 8),
                new BattleShip("Царь", 28.0, 10),
                new BattleShip("Сила", 32.1, 12),
                new BattleShip("Океан", 29.8, 6),
                new BattleShip("Буря", 31.0, 9)
        };

        CruiseLiner[] cruiseLiners = {
                new CruiseLiner("Солнце", 22.5, 500),
                new CruiseLiner("Море", 24.0, 450),
                new CruiseLiner("Берег", 21.5, 600),
                new CruiseLiner("Пляж", 23.0, 400),
                new CruiseLiner("Белуга", 25.0, 550)
        };

        for (BattleShip ship : battleShips) {
            ship.printInfo();
        }

        for (CruiseLiner liner : cruiseLiners) {
            liner.printInfo();
        }
    }
}
