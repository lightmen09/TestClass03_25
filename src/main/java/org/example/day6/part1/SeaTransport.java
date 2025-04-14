package org.example.day6.part1;

public class SeaTransport {
    public static void main(String[] args) {
        BattleShip battleShip1 = new BattleShip("A",10,20);
        BattleShip battleShip2 = new BattleShip("B",90,40);
        BattleShip battleShip3 = new BattleShip("C",20,30);
        BattleShip battleShip4 = new BattleShip("D",70,60);
        BattleShip battleShip5 = new BattleShip("E",80,70);
      //  BattleShip[] arr = new BattleShip[5]{battleShip1,battleShip2,battleShip3,battleShip4,battleShip5};

        System.out.println("Battle Ships: ");
        battleShip1.printInfo();
        battleShip2.printInfo();
        battleShip3.printInfo();
        battleShip4.printInfo();
        battleShip5.printInfo();

        System.out.println();

        CruiseLainer cruiseLainer1 = new CruiseLainer("Z",10,20);
        CruiseLainer cruiseLainer2 = new CruiseLainer("X",20,30);
        CruiseLainer cruiseLainer3 = new CruiseLainer("Y",30,20);
        CruiseLainer cruiseLainer4 = new CruiseLainer("Q",40,50);
        CruiseLainer cruiseLainer5 = new CruiseLainer("W",60,70);

        System.out.println("Cruise Lainers: ");
        cruiseLainer1.printInfo();
        cruiseLainer2.printInfo();
        cruiseLainer3.printInfo();
        cruiseLainer4.printInfo();
        cruiseLainer5.printInfo();
    }
}
