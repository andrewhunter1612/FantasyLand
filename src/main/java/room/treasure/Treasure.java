package room.treasure;

import behaviours.IRoomItem;

public class Treasure implements IRoomItem {

    private String treasureName;
    private int treasureValue;

    public Treasure(TreasureType treasureType) {
        this.treasureName = treasureType.getName();
        this.treasureValue = treasureType.getValue();
    }

    public String getTreasureName() {
        return treasureName;
    }

    public int getTreasureValue() {
        return treasureValue;
    }
}
