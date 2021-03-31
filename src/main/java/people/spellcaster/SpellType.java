package people.spellcaster;

public enum SpellType {
    FIREBALL(60),
    MAGIC(40);

    private final int damage;

    SpellType(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
