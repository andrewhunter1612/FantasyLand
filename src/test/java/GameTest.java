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
    Player player, player1;
    Room room, room1;
    Enemy enemy;
    Treasure treasure;

    @Before
    public void before() {
        game = new Game();

        player = new PlayerImplementation("John");
        player1 = new PlayerImplementation("Fred");

        enemy = new Enemy(EnemyType.INSTRUCTOR);
        treasure = new Treasure(TreasureType.GOLD);

        room = new Room(1, enemy);
        room1 = new Room(2, treasure);

        game.addPlayer(player);
        game.addPlayer(player1);

        game.addRoom(room);

        game.playGame();
    }

    @Test
    public void gameHasPlayers() {
//        assertEquals(100, player.getMoney(), 0.0);
//        assertEquals(100, player1.getMoney(), 0.0);
        assertEquals(90, player.getHealthPoints());
        assertEquals(90, player1.getHealthPoints());
    }

//    @Test
//    public void gameHasRooms() {
//        assertEquals(1, game.getRooms().size());
//    }
}
