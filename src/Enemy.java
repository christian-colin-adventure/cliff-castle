import java.util.Random;

public class Enemy {

    private int Health;
    private int Armor;
    private int Attack;
    private String name;


    public int getHealth() {
        return this.Health;
    }

    public int getArmor() {
        return this.Armor;
    }

    public int getAttack(){
        return this.Attack;
    }

    public String getName() {
        return name;
    }

    public void setHealth(int newHealth){
        this.Health = newHealth;
    }

    public void setArmor(int newArmor) {
        this.Armor = newArmor;
    }

    public Enemy(int health, int armor, int attackPower, String name){
        this.Health = health;
        this.Armor = armor;
        this.Attack = attackPower;
        this.name = name;
    }
    public int[] attack(int health, int armor) {
        Random rand = new Random();
        // Health and armor is going to equal opposition health and armor.
        // Attack points is going to be whoever is attacking.
        int hit = rand.nextInt(this.getAttack());

        if (armor >= hit) {
            armor = armor - hit;
        } else {
            health -= (hit - armor);
            armor = 0;
        }
        return new int[]{health, armor, hit};
    }
}
