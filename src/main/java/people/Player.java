package people;

public abstract class Player {
    private String name;
    private int healthPoints;

    public Player(String name) {
        this.name = name;
        this.healthPoints = 100;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void takeDamage(int damage){
        this.healthPoints -= damage;
    }

    public void increaseHealth(int health){
        this.healthPoints += health;
    }
}
