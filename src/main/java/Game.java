import behaviours.Fighter;
import behaviours.Healer;
import behaviours.IPlayer;
import people.Player;
import room.Room;
import room.enemy.Enemy;
import room.treasure.Treasure;

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

    public boolean allPlayersDead() {
        boolean allDead = true;
        for (IPlayer player : this.players) {
            if (!((Player) player).isDead()) {
                allDead = false;
                break;
            }
        }
        return allDead;
    }

    public boolean enemyAlive(Enemy enemy) {
        return enemy.getEnemyHealth() > 0;
    }

    public void playGame() {
        for (int i = 0; i < this.rooms.size(); i++) {
            Room room = this.rooms.get(i);
            if (room.getRoomItem() instanceof Enemy) {
                while (enemyAlive((Enemy) room.getRoomItem()) || allPlayersDead()) {
                    if (Math.floor(Math.random() * 2) == 0) {
                        //Enemy goes first
                        for (IPlayer player : this.players) {
                            causeDamageToPlayer((Player) player, enemyTurn(room));
                        }
                    } else {
                        //players go first
                        for (IPlayer player : this.players) {
                            if (player instanceof Fighter) {
                                ((Enemy) room.getRoomItem()).loseHealth(((Fighter) player).attack());
                            } else {
                                this.players.get(0).increaseHealth(((Healer) player).heal());
                            }
                        }
                    }
//                    System.out.println(((Enemy) room.getRoomItem()).getEnemyHealth());

                }
                //check for winner
                if (!enemyAlive((Enemy) room.getRoomItem())) {
                    if (i == this.rooms.size()) {
                        System.out.println("You finished all rooms");
                        break;
                    } else {
                        continue;
                    }
                } else {
                    System.out.println("You dead");
                    break;
                }

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

    public void causeDamageToPlayer(Player player, int damage) {
        player.takeDamage(damage / this.players.size());
    }

}
