/*public class Monsters {
    public static final Monster andariel = new Monster(10, 70) {
        @Override
        public void attack(Fighter victim) {
            victim.takeHit(getDamage());
        }

        @Override
        public void takeHit(int damage) {
            health -= damage;
            Monsters.monstersHealth -= damage;
        }
    };

    public static final Monster blacksmith = new Monster(100, 25) {
        @Override
        public void attack(Fighter victim) {
            victim.takeHit(getDamage());
        }

        @Override
        public void takeHit(int damage) {
            health -= (5 + damage);
            Monsters.monstersHealth -= (5 + damage);
        }
    };

    public static int monstersHealth = andariel.getHealth() + blacksmith.getHealth();
}*/

class Monsters {
    static final Monster andariel = new Monster(10, 70) {};
    static final Monster blacksmith = new Monster(100, 25) {};

    static int monstersHealth = andariel.getHealth() + blacksmith.getHealth();
}