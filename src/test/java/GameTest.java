import behaviours.IRoomItem;
import org.junit.Before;
import org.junit.Test;
import people.Player;
import people.PlayerImplementation;
import people.cleric.Cleric;
import people.cleric.HealingType;
import people.warrior.Warrior;
import people.warrior.WarriorType;
import people.warrior.WeaponType;
import room.Room;
import room.enemy.Enemy;
import room.enemy.EnemyType;
import room.treasure.Treasure;
import room.treasure.TreasureType;

import java.lang.reflect.Array;
import java.util.Arrays;

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

        player = new Cleric("John", HealingType.CALPOL);
        player1 = new Warrior("Fred", WarriorType.DWARF, WeaponType.AXE);

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
        System.out.println(player.getHealthPoints());
        System.out.println(enemy.getEnemyHealth());
//        String test = Arrays.toString(HealingType.values());
//        String[] array = test.split(", ");
//        System.out.println(array[0]);

//        assertEquals(100, player.getMoney(), 0.0);
//        assertEquals(100, player1.getMoney(), 0.0);
//        assertEquals(90, player.getHealthPoints());
//        assertEquals(90, player1.getHealthPoints());
    }

//    @Test
//    public void gameHasRooms() {
//        assertEquals(1, game.getRooms().size());
//    }
}
