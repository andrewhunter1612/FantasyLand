import behaviours.IPlayer;
import people.Player;
import room.Room;
import room.enemy.Enemy;
import room.treasure.Treasure;

import java.util.ArrayList;

import static java.lang.Math.random;

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

    public void playGame() {
        for (Room room : this.rooms) {
            if (room.getRoomItem() instanceof Enemy) {

                if (Math.floor(Math.random() * 2) == 0) {
                    //Enemy goes first
                    for (IPlayer player : this.players){
                        causeDamageToPlayer((Player) player, enemyTurn(room));
                    }
                } else {
                    //players go first

                    for (IPlayer player : this.players) {

                    }
                }

                System.out.println(Math.floor(random() * 2));
            } else {
                for (IPlayer player : this.players) {
                    ((Player) player).addMoney(Double.parseDouble(String.valueOf(((Treasure) room.getRoomItem()).getTreasureValue() / this.players.size())));
                }

            }
        }
    }

    public int enemyTurn(Room room) {
        return ((Enemy) room.getRoomItem()).getEnemyDamage();
    }

    public void causeDamageToPlayer(Player player, int damage){
        player.takeDamage(damage/this.players.size());
    }

}
