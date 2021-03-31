package people.warrior;

public enum WarriorType {
    DWARF("Dwarf"),
    STUDENT("Student"),
    HUMAN("Human");

    private final String warriorType;

    WarriorType(String warriorType) {
        this.warriorType = warriorType;
    }

    public String getWarriorType() {
        return warriorType;
    }
}
