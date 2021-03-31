package people;

import behaviours.IPlayer;

public abstract class Player implements IPlayer{
    private String name;
    private int healthPoints;
    private double money;

    public Player(String name) {
        this.name = name;
        this.healthPoints = 100;
        this.money = 0;
    }

    public double getMoney() {
        return money;
    }

    public void addMoney(double money) {
        this.money += money;
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
