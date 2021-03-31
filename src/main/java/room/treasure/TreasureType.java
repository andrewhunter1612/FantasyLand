package room.treasure;

import behaviours.IRoomItem;

public enum TreasureType {

    GOLD("Gold", 200),
    SILVER("Silver", 100);

    private final String name;
    private final int value;

    TreasureType(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
}
