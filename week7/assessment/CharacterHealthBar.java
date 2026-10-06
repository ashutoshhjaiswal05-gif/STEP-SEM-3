class GameCharacter {
    private int health;
    private final int maxHealth;

    public GameCharacter(int maxHealth) {
        this.maxHealth = maxHealth;
        this.health = maxHealth;
    }

    public void takeDamage(int amount) {
        if (amount > 0) {
            health = Math.max(0, health - amount);
        }
    }

    public void heal(int amount) {
        if (amount > 0) {
            health = Math.min(maxHealth, health + amount);
        }
    }

    public int getHealth() {
        return health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }
}

public class CharacterHealthBar {
    public static void main(String[] args) {
        GameCharacter hero = new GameCharacter(100);
        hero.takeDamage(40);
        System.out.println("Health after 40 damage: " + hero.getHealth());
        hero.heal(20);
        System.out.println("Health after 20 heal: " + hero.getHealth());
        hero.heal(50);
        System.out.println("Health capped at max: " + hero.getHealth());
    }
}
