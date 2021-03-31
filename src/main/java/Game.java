import behaviours.IPlayer;
import room.Room;

import java.util.ArrayList;

public class Game {
    private ArrayList<IPlayer> players;
    private ArrayList<Room> rooms;

    public Game() {
        this.players = new ArrayList<>();
        this.rooms = new ArrayList<>();
    }

    public ArrayList<IPlayer> getPlayers() {
        return players;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void addPlayer(IPlayer player) {
        this.players.add(player);
    }

    public void addRoom(Room room) {
        this.rooms.add(room);
    }
}
