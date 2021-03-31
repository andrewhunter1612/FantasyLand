package people.spellcaster;

public enum SpellcasterType {
    WIZARD("Wizard"),
    WARLOCK("Warlock");

    private final String name;

    SpellcasterType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
