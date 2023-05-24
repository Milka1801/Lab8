/*public class ExtraordinaryVillager extends Villager {
    private int age;

    public ExtraordinaryVillager(int age) {
        this.age = age;
    }
    public enum Skill {
        IDENTIFY("I will identify items for you at no charge."),
        SHELTER("I can offer you poor shelter.");

        private final String description;

        Skill(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }
    }

    private Skill skill;

    public ExtraordinaryVillager(String name, int age, Skill skill) {
        super(name, age);
        this.skill = skill;
    }

    @Override
    public void sayHello() {
        System.out.println("Greetings traveler... I'm " + getName() + " and I'm " + getAge() + " years old." +
                (skill != null ? " " + skill.getDescription() : ""));
    }
    @Override
    public void attack(Fighter victim) {
        // ExtraordinaryVillager does not deal any damage
    }

    @Override
    public void takeHit(int damage) {
        // ExtraordinaryVillager dies from a single hit
        setHealth(0);
    }

    private void setHealth(int health) {
        this.health = health;
    }

    private int getHealth() {
        return health;
    }

    private int getAge() {
        return age;
    }
}



*/

class ExtraordinaryVillager implements Fighter {
    private int health;
    private int age;
    private boolean dead;

    public ExtraordinaryVillager(int age) {
        this.health = 100;
        this.age = age;
        this.dead = false;
    }

    public int getHealth() {
        return health;
    }

    @Override
    public void attack(Fighter victim) {
        // ExtraordinaryVillager nie zadaje obrażeń
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
