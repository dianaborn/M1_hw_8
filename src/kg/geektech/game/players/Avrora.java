package kg.geektech.game.players;

public class Avrora extends Hero {
    private int sevDamage;

    public Avrora(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.MIRROR_DEATH);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        sevDamage = boss.getDamage();
        if (sevDamage > 0 ){
            int i = this.getDamage() + boss.getDamage()/9;
            System.out.println("Avrora MIRROR_DEATH: " + i );
        }
    }
}
