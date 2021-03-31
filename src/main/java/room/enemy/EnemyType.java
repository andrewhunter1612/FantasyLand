package room.enemy;

import behaviours.IRoomItem;

public enum EnemyType {

    INSTRUCTOR("Instructor", 100, 20),
    JUNKIE("Junkie", 150, 30);

    private final String name;
    private final int health;
    private final int damage;

    EnemyType(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }
}
