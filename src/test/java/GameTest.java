import org.junit.Before;
import org.junit.Test;
import people.Player;
import people.PlayerImplementation;
import room.Room;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Game game;
    Player player;
    Room room;

    @Before
    public void before() {
        game = new Game();
        player = new PlayerImplementation("John");
        room = new Room();
        game.addPlayer(player);
        game.addRoom(room);
    }

    @Test
    public void gameHasPlayers() {
        assertEquals(1, game.getPlayers().size());
    }

    @Test
    public void gameHasRooms() {
        assertEquals(1, game.getRooms().size());
    }
}
