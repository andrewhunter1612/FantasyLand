package room;

import behaviours.IRoomItem;

public class Room {

    private int roomNumber;
    private IRoomItem roomItem;

    public Room(int roomNumber, IRoomItem roomItem) {
        this.roomNumber = roomNumber;
        this.roomItem = roomItem;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public IRoomItem getRoomItem() {
        return roomItem;
    }

    public void removeItem() {
        this.roomItem = null;
    }
}
