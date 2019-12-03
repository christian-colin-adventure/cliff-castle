import java.util.Random;

public class Hero {
    // Player attributes
    private int Health = 100;
    private String charClass;
//    private int Armor = 25;
    private int Attack = 25;
    private int Potion = 5;
    private int MovementSpeed; // this is paces per move
    private Armor headSlot;
    private Armor chestSlot;
    private Armor bootSlot;
    private static int enemyhp;
    private static int enemymeleedmg;
    private static int Level;
    private String name;

    private void cheater() {
            this.setHealth(10000);
//            this.setArmor(10000);
            this.setAttack(10000);
            this.setMovementSpeed(10000);
    }
    public void checkName(){
            if (this.name.trim().equalsIgnoreCase("cheater")) {
            cheater();
            }
    }

    public void setClassAtt(String charClass){
        if(charClass.equalsIgnoreCase("Warrior")){
            this.setHealth(150);
            this.setAttack(20);
            this.setPotion(5);
            this.setMovementSpeed(7);
            this.setHeadSlot(Equipment.EmptySlot);
            this.setChestSlot(Equipment.ChainmailChest);
            this.setBootSlot(Equipment.LeatherBoots);
            Level = 1;
        } else if(charClass.equalsIgnoreCase("Paladin")) {
            this.setHealth(120);
            this.setAttack(30);
            this.setPotion(3);
            this.setMovementSpeed(7);
            this.setHeadSlot(Equipment.EmptySlot);
            this.setChestSlot(Equipment.PlateChest);
            this.setBootSlot(Equipment.PlateBoots);
            Level = 1;
        } else if(charClass.equalsIgnoreCase("Barbarian")) {
            this.setHealth(225);
            this.setAttack(40);
            this.setPotion(0);
            this.setMovementSpeed(5);
            this.setHeadSlot(Equipment.EmptySlot);
            this.setChestSlot(Equipment.LeatherTunic);
            this.setBootSlot(Equipment.LeatherBoots);
            Level = 1;
//        } else if(charClass.equals("Ranger")) {
//            this.setHealth(130);
//            this.setAttack(15);
//            this.setArmor(50);
//            this.setPotion(5);
//            this.setMovementSpeed(10);
//        } else if(charClass.equals("Mage")) {
//            this.setHealth(120);
//            this.setAttack(10);
//            this.setArmor(0);
//            this.setPotion(4);
//            this.setMovementSpeed(3);
//        }
        }
        //This curly bracket can be deleted when these classes are uncommented
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

//    public int getArmor() {
//        return this.Armor;
//    }

    public int getAttack(){
        return this.Attack;
    }

    public int getPotion(){
        return this.Potion;
    }


    public void setHealth(int newHealth){
        this.Health = newHealth;
    }

//    public void setArmor(int newArmor){
//        this.Armor = newArmor;
//    }

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

    public void increaseAttack(int numIncrease){
        this.Attack += numIncrease;
    }



    public String getCharClass() {
        return charClass;
    }

    public void setCharClass(String charClass) {
        this.charClass = charClass;
    }

    public Armor getHeadSlot() {
        return headSlot;
    }

    public void setHeadSlot(Armor headSlot) {
        this.headSlot = headSlot;
    }

    public Armor getChestSlot() {
        return chestSlot;
    }

    public void setChestSlot(Armor chestSlot) {
        this.chestSlot = chestSlot;
    }

    public Armor getBootSlot() {
        return bootSlot;
    }

    public void setBootSlot(Armor bootSlot) {
        this.bootSlot = bootSlot;
    }

    public static int getEnemyhp() {
        return enemyhp;
    }

    public static void setEnemyhp(int enemyhp) {
        Hero.enemyhp = enemyhp;
    }

    public static int getEnemymeleedmg() {
        return enemymeleedmg;
    }

    public static void setEnemymeleedmg(int enemymeleedmg) {
        Hero.enemymeleedmg = enemymeleedmg;
    }

    public static int getLevel() {
        return Level;
    }

    public static void setLevel(int level) {
        Level = level;
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

    public double getArmorRating(){
        return (this.getHeadSlot().getArmorRating()+this.getChestSlot().getArmorRating()+this.getBootSlot().getArmorRating())/100.0;
    }
}
