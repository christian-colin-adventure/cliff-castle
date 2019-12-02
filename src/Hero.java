import java.util.Random;

public class Hero {
    // Player attributes
    private int Health = 100;
    private String charClass;
    private int Armor = 25;
    private int Attack = 25;
    private int Potion = 5;
    private int MovementSpeed; // this is paces per move
    private static int enemyhp;
    private static int enemymeleedmg;
    private static int Level;
    private String name;
    private boolean wearingHelm = false;

    private void cheater() {
            this.setHealth(10000);
            this.setArmor(10000);
            this.setAttack(10000);
            this.setMovementSpeed(10000);
    }
    public void checkName(){
            if (this.name.trim().equalsIgnoreCase("cheater")) {
            cheater();
            }
    }

    public void setClassAtt(String charClass){
        if(charClass.equals("Warrior")){
            this.setHealth(150);
            this.setAttack(20);
            this.setArmor(25);
            this.setPotion(5);
            this.setMovementSpeed(7);
            Level = 1;
        } else if(charClass.equals("Paladin")) {
            this.setHealth(120);
            this.setAttack(30);
            this.setArmor(30);
            this.setPotion(3);
            this.setMovementSpeed(7);
            Level = 1;
        } else if(charClass.equals("Barbarian")) {
            this.setHealth(225);
            this.setAttack(40);
            this.setArmor(0);
            this.setPotion(0);
            this.setMovementSpeed(5);
            Level = 1;
        }
    }


    public Hero(String name){
        this.name = name;
        this.charClass = charClass;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return this.Health;
    }

    public int getArmor() {
        return this.Armor;
    }

    public int getAttack(){
        return this.Attack;
    }

    public int getPotion(){
        return this.Potion;
    }

    public boolean isWearingHelm(){
        return wearingHelm;
    }

    public void setHealth(int newHealth){
        this.Health = newHealth;
    }

    public void setArmor(int newArmor){
        this.Armor = newArmor;
    }

    public void setPotion(int potion) {
        this.Potion = potion;
    }

    public void setAttack(int attack) {
        this.Attack = attack;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMovementSpeed() {
        return MovementSpeed;
    }

    public void setMovementSpeed(int movementSpeed) {
        MovementSpeed = movementSpeed;
    }

    public void setWearingHelm(boolean wearingHelm) {
        this.wearingHelm = wearingHelm;
    }

    public void increaseAttack(int numIncrease){
        this.Attack += numIncrease;
    }

    public void increaseArmor(int numIncrease){
        this.Armor += numIncrease;
    }

    public int[] attack(int enemyHealth, int enemyArmor) {
        Random rand = new Random();
        // Health and armor is going to equal opposition health and armor.
        // Attack points is going to be whoever is attacking.
        int hit;
        if (this.Attack > 40) {
            hit = rand.nextInt(Attack - 15) + 15;
        } else
            hit = rand.nextInt(Attack);
        if (enemyArmor >= hit) {
            enemyArmor = enemyArmor - hit;
        } else {
            enemyHealth -= (hit - enemyArmor);
            enemyArmor = 0;
        }

        return new int[]{enemyHealth, enemyArmor, hit};
    }
}
