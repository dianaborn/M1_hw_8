package kg.geektech.game.players;

public class Berserk extends Hero {
    private int savedDamage;

    public Berserk(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }

    public void setSavedDamage(int savedDamage) {
        this.savedDamage = savedDamage;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        savedDamage = boss.getDamage();
        if (savedDamage > 0 ){
            int i = this.getDamage() + boss.getDamage()/2;
            System.out.println("Berserk SAVE_DAMAGE_AND_REVERT:" + i);
        }

    }
}



