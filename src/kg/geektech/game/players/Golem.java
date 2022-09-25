package kg.geektech.game.players;

public class Golem extends Hero {
    private int heroDamage;

    public Golem(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.TOTEM);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        heroDamage = getHealth();
        if (heroDamage > 0) {
            int i = (int) (this.getDamage() + boss.getDamage() / 1.5);
            System.out.println("Golem: TOTEM " + i);
        }
    }
}
