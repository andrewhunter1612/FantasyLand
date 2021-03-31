package room_test;

import behaviours.IRoomItem;
import org.junit.Before;
import org.junit.Test;
import room.Room;
import room.enemy.Enemy;
import room.enemy.EnemyType;
import room.treasure.Treasure;
import room.treasure.TreasureType;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room, room1;
    Enemy enemy;
    Treasure treasure;

    @Before
    public void before() {
        treasure = new Treasure(TreasureType.GOLD);
        enemy = new Enemy(EnemyType.INSTRUCTOR);
        room = new Room(1, enemy);
        room1 = new Room(2, treasure);
    }

    @Test
    public void checkConstructor(){
        assertEquals(200, ((Treasure) room1.getRoomItem()).getTreasureValue());
    }
}
