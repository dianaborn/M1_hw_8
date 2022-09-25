package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Deku extends Hero {

    public Deku(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.INCREASE_STRENGTH);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int vor = RPG_Game.random.nextInt( 2) + 5;
        int i = this.getDamage() + boss.getDamage() /8;
        boss.setHealth(boss.getHealth() - this.getDamage() * vor + i);
        System.out.println("Deku INÑREASE: " + this.getDamage() * vor + i);

    }
}