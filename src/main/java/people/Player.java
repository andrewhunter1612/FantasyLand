package people;

import behaviours.IPlayer;

public abstract class Player implements IPlayer{
    private String name;
    private int healthPoints;
    private double money;
    private boolean dead;

    public Player(String name) {
        this.name = name;
        this.healthPoints = 100;
        this.money = 0;
        this.dead = false;
    }

    public double getMoney() {
        return money;
    }

    public void addMoney(double money) {
        this.money += money;
    }

    public void checkIfDead(){
        if (this.healthPoints <=0){
            this.dead = true;
        }
    }

    public boolean isDead() {
        return dead;
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
