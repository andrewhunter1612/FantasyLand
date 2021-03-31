package room.enemy;

import behaviours.IRoomItem;

public class Enemy implements IRoomItem {

    private EnemyType enemyType;
    private int health;

    public Enemy(EnemyType enemyType) {
        this.enemyType = enemyType;
        this.health = enemyType.getHealth();
    }

    public String getEnemyName() {
        return this.enemyType.getName();
    }

    public int getEnemyHealth() {
       return this.health;
    }

    public int getEnemyDamage() {
        return this.enemyType.getDamage();
    }

    public void loseHealth(int damage) {
        this.health -= damage;
    }
}
