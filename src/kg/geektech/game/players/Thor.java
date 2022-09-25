package kg.geektech.game.players;

import java.util.Random;

public class Thor extends Hero {
    public Thor(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.ULTRASOUND);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        Random random = new Random();
        boolean thors = random.nextBoolean();
        if (heroes[7].getHealth() > 0 && thors == true) {
            int i = this.getDamage() + boss.getDamage()/6;
            System.out.println("Thor ULTRASOUND:" + i );
        }
    }
}
