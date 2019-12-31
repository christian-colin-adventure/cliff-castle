package characters.player;

public abstract class Character {
    protected int Health;
    protected int Attack;
    protected int MovementSpeed;
    protected String Name;
    protected int Level;

    public Character(String name) {
        Name = name;
    }


}
