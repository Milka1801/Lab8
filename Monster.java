/*public abstract class Monster implements Fighter {
    protected int health;
    private int damage;

    protected Monster(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }
}*/


abstract class Monster implements Fighter {
    private int health;
    private int damage;

    public Monster(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    @Override
    public void attack(Fighter victim) {
        if (!isDead()) {
            victim.takeHit(getDamage());
        }
    }

    @Override
    public void takeHit(int damage) {
        health -= damage;
    }

    @Override
    public boolean isDead() {
        return health <= 0;
    }
}
