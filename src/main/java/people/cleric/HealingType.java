package people.cleric;

public enum HealingType {
    HERB("Herb", 40),
    CALPOL("Calpol", 100);

    private final String name;
    private final int healing;

    HealingType(String name, int healing) {
        this.name = name;
        this.healing = healing;
    }

    public String getName() {
        return name;
    }

    public int getHealing() {
        return healing;
    }
}
