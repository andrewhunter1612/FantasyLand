import behaviours.IRoomItem;
import org.junit.Before;
import org.junit.Test;
import people.Player;
import people.PlayerImplementation;
import room.Room;
import room.enemy.Enemy;
import room.enemy.EnemyType;
import room.treasure.Treasure;
import room.treasure.TreasureType;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Game game;
    Player player;
    Room room;
    Enemy enemy;
    Treasure treasure;

    @Before
    public void before() {
        game = new Game();
        player = new PlayerImplementation("John");
        enemy = new Enemy(EnemyType.INSTRUCTOR);
        room = new Room(1, enemy);
//        treasure = new Treasure(TreasureType.GOLD);
        Room room1 = new Room(2, treasure);
        game.addPlayer(player);
        game.addRoom(room);
    }
//
//    @Test
//    public void gameHasPlayers() {
//        assertEquals(1, game.getPlayers().size());
//    }
//
//    @Test
//    public void gameHasRooms() {
//        assertEquals(1, game.getRooms().size());
//    }
}
