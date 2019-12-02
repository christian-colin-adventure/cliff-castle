import java.util.Random;

public class Enemies {

    private int Health;
    private int Armor;
    private int MeleeAttack;
    private int RangeAttack;
    private int MovementSpeed;
    private static int enemyhp; // this might be Health
    private static int enemymeleedmg; // this might be Attack
    private static int Level;
    private String name;



    // TODO: Make enemies random enemies and make stronger versions of them when player levels up

    private static String[] enemyHpArray = {"1", "10", "20", "30", "40", "50"};

    private static String[] enemyMeleedmgArray = {"1", "7", "11", "17", "20", "24"};

//    int[] enemyHpArray = {1, 9, 19, 24, 32, 40};
//    int[] enemyMeleedmgArray = {1, 1, 4, 6, 7, 9};
//    Health = enemyHpArray[Level];
//    Attack = enemyMeleedmgArray[Level];

    public int getHealth() {
        return this.Health;
    }

    public int getArmor() {
        return this.Armor;
    }

    public int getMeleeAttack(){
        return this.MeleeAttack;
    }

    public String getName() {
        return name;
    }

    public int getRangeAttack() { return RangeAttack; }

    public void setHealth(int newHealth){
        this.Health = newHealth;
    }

    public void setArmor(int newArmor) {
        this.Armor = newArmor;
    }

    public Enemies(int health, int armor, int meleePower,int rangePower, String name){
        this.Health = health;
        this.Armor = armor;
        this.MeleeAttack = meleePower;
        this.RangeAttack = rangePower;
        this.name = name;
    }
    public int[] meleeAttack(int health, int armor) {
        Random rand = new Random();
        // Health and armor is going to equal opposition health and armor.
        // Attack points is going to be whoever is attacking.
        int hit = rand.nextInt(this.getMeleeAttack());

        if (armor >= hit) {
            armor = armor - hit;
        } else {
            health -= (hit - armor);
            armor = 0;
        }
        return new int[]{health, armor, hit};
    }

    public int[] rangeAttack(int health, int armor){
        Random rand = new Random();
        int hit = rand.nextInt(this.getRangeAttack());

        if (armor >= hit) {
            armor = armor - hit;
        } else {
            health -= (hit - armor);
            armor = 0;
        }
        return new int[]{health, armor, hit};
    }
}
