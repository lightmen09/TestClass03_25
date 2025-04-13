package org.example.day6;

public class TournamentApp {
    public static boolean canFight(Player player) {
        return (player.hasSword || player.hasShield) && !player.isBanned && !player.isDrunk ;
    }
    public static void main(String[] args) {
        Player player1 = new Player(true,true,true, false);
        Player player2 = new Player(true,false,false, false);
        Player player3 = new Player(false,false,true, false);

        System.out.println("Игрок 1 может драться? " + canFight(player1));
        System.out.println("Игрок 2 может драться? " + canFight(player2));
        System.out.println("Игрок 3 может драться? " + canFight(player3));

        System.out.println(player1);
    }
}
