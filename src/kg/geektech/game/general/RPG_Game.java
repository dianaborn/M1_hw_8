package kg.geektech.game.general;

import kg.geektech.game.players.*;

import java.util.Random;


public class RPG_Game {

    private static int roundNumber;
    public static Random random = new Random();

    public static void startGame() {
        Boss boss = new Boss(1000, 50, "Madara");

        Warrior warrior = new Warrior(270, 10, "Cacke");
       Medic doc = new Medic(250, 10, 15, "Rainor");
        Magic magic = new Magic(260, 15, "Itachi");
        Berserk berserk = new Berserk(280, 10, "Dziraya");
        Medic assistant = new Medic(290, 10, 5, "Deni");
        Deku deku = new Deku(300, 20, "Naryto");
        Avrora avrora = new Avrora(300, 15, "Sakyra");
        Thor thor = new Thor(270, 15, "Nogato");
        Golem golem = new Golem(350, 20, "Gaara");
        Hero[] heroes = {warrior, doc, magic, berserk, assistant, deku, avrora, thor, golem};

        printStatistics(boss, heroes);
        while (!isGameFinished(boss, heroes)) {
            playRound(boss, heroes);
        }
    }

    private static void playRound(Boss boss, Hero[] heroes) {
        roundNumber++;
        boss.chooseDefence(heroes);
        boss.attack(heroes);
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getAbility() != boss.getDefence() && heroes[i].getHealth() > 0) {
                heroes[i].attack(boss);
                heroes[i].applySuperPower(boss, heroes);
            }
        }
        printStatistics(boss, heroes);
    }

    private static void printStatistics(Boss boss, Hero[] heroes) {
        System.out.println("ROUND " + roundNumber + " ----------------");
        System.out.println(boss);
        for (int i = 0; i < heroes.length; i++) {
            System.out.println(heroes[i]);
        }
    }

    private static boolean isGameFinished(Boss boss, Hero[] heroes) {
        if (boss.getHealth() <= 0) {
            System.out.println("Heroes won!!!");
            return true;
        }
        boolean allHeroesDead = true;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0) {
                allHeroesDead = false;
                break;
            }
        }
        if (allHeroesDead) {
            System.out.println("Boss won!!!");
        }
        return allHeroesDead;
    }
}