/*public class Main {
    public static void main(String[] args) {
        ExtraordinaryVillager kashya = new ExtraordinaryVillager("Kashya", 30, null);
        ExtraordinaryVillager akara = new ExtraordinaryVillager("Akara", 40, ExtraordinaryVillager.Skill.SHELTER);
        ExtraordinaryVillager gheed = new ExtraordinaryVillager("Gheed", 50, null);
        ExtraordinaryVillager deckardCain = new ExtraordinaryVillager("Deckard Cain", 85, ExtraordinaryVillager.Skill.IDENTIFY);
        Villager warriv = new Villager("Warriv", 35);
        Villager flawia = new Villager("Flawia", 25);

        kashya.sayHello();
        akara.sayHello();
        gheed.sayHello();
        deckardCain.sayHello();
        warriv.sayHello();
        flawia.sayHello();
    }
}*/

public class Main {
    public static void main(String[] args) {
        Villager deckardCain = new Villager(85);
        Villager akara = new Villager(40);

        Villager extraordinaryDeckardCain = new Villager(85);
        Villager extraordinaryAkara = new Villager(40);

        Monster andariel = new Monster(10, 70) {
            @Override
            public String toString() {
                return "Andariel";
            }
        };

        Monster blacksmith = new Monster(100, 25) {
            @Override
            public String toString() {
                return "Blacksmith";
            }
        };

        int monstersHealth = andariel.getHealth() + blacksmith.getHealth();

        while (monstersHealth > 0) {
            // Osadnik atakuje potwora
            if (!deckardCain.isDead()) {
                deckardCain.attack(andariel);
                if (andariel.isDead()) {
                    System.out.println(andariel.toString() + " has been defeated!");
                }
            }

            // Potwór atakuje osadnika
            if (!andariel.isDead()) {
                andariel.attack(deckardCain);
                if (deckardCain.isDead()) {
                    System.out.println(deckardCain.toString() + " has been defeated!");
                }
            }

            monstersHealth = andariel.getHealth() + blacksmith.getHealth();
            System.out.println("Monsters have " + monstersHealth + " health points remaining.");

            // Osadnik atakuje potwora
            if (!akara.isDead()) {
                akara.attack(blacksmith);
                if (blacksmith.isDead()) {
                    System.out.println(blacksmith.toString() + " has been defeated!");
                }
            }

            // Potwór atakuje osadnika
            if (!blacksmith.isDead()) {
                blacksmith.attack(akara);
                if (akara.isDead()) {
                    System.out.println(akara.toString() + " has been defeated!");
                }
            }

            monstersHealth = andariel.getHealth() + blacksmith.getHealth();
            System.out.println("Monsters have " + monstersHealth + " health points remaining.");
        }

        System.out.println("The settlement has been saved!");

        // Przywrócenie mocy ExtraordinaryVillager'om
        deckardCain = extraordinaryDeckardCain;
        akara = extraordinaryAkara;

        // Wywołanie metod z klasy ExtraordinaryVillager
        deckardCain.attack(blacksmith);
        akara.attack(andariel);
    }
}