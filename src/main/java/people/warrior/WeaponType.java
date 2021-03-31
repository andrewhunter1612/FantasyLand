package people.warrior;

public enum WeaponType {
    SWORD("Sword", 40),
    AXE("Axe", 35),
    CLUB("Club", 10);

    private final int damage;
    private final String weapon;

    WeaponType(String weapon, int damage) {
        this.damage = damage;
        this.weapon = weapon;
    }

    public int getDamage() {
        return damage;
    }

    public String getWeapon() {
        return weapon;
    }
}
