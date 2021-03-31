package people.spellcaster;

public enum CreatureType {
    DRAGON("Dragon", 200),
    OGRE("Ogre", 100);

    private final String name;
    private final int health;

    CreatureType(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }
}
