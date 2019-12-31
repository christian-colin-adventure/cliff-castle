package items;

public class Armor {
    private String name;
    private int armorRating;
    private String type;
    private String statBoost;

    public Armor(String name, int armorRating, String type, String statBoost) {
        this.name = name;
        this.armorRating = armorRating;
        this.type = type;
        this.statBoost = statBoost;
    }


    public int getArmorRating() {
        return armorRating;
    }

    public void setArmorRating(int armorRating) {
        this.armorRating = armorRating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatBoost() {
        return statBoost;
    }

    public void setStatBoost(String statBoost) {
        this.statBoost = statBoost;
    }

}
