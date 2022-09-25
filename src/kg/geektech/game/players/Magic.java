package kg.geektech.game.players;

   import java.util.Random;

    public class Magic extends Hero {
        private int bigAttack;

        public Magic(int health, int damage, String name) {

            super(health, damage, name, SuperAbility.BOOST);
        }

        @Override
        public void applySuperPower(Boss boss, Hero[] heroes) {
            Random random = new Random();
            boolean mag = random.nextBoolean();
            for (int i = 0; i < heroes.length; i++) {
                if (heroes.length > 0 + bigAttack)
                    bigAttack = 14;
                System.out.println(" Magic BOOST:" + bigAttack);
            }
        }
    }
