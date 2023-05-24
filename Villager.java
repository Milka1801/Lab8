/*public class Villager implements Fighter {
    protected String name;
    protected int age;
    protected int health=100;

    public Villager(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void sayHello() {
        System.out.println("Greetings traveler... I'm " + name + " and I'm " + age + " years old.");
    }
    public int getHealth() {
        return health;
    }

    @Override
    public void attack(Fighter victim) {
        int damage = (int) ((100 - ((Villager) victim).getAge() * 0.5) / 10);
        victim.takeHit(damage);
    }

    @Override
    public void takeHit(int damage) {
        health -= damage;
    }
}

*/


class Villager implements Fighter {
    private int health;
    private int age;
    private boolean dead;

    public Villager(int age) {
        this.health = 100;
        this.age = age;
        this.dead = false;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return (int) ((100 - age * 0.5) / 10);
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
        if (health <= 0) {
            dead = true;
        }
    }

    @Override
    public boolean isDead() {
        return dead;
    }
}