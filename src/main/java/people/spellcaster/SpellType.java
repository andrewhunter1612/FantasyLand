package people.spellcaster;

public enum SpellType {
    FIREBALL("Fireball", 60),
    MAGIC("Magic", 40);

    private final int damage;
    private final String name;

    SpellType(String name, int damage) {
        this.damage = damage;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }
}
