package room_test;

import org.junit.Before;
import org.junit.Test;
import room.treasure.Treasure;
import room.treasure.TreasureType;

import static org.junit.Assert.assertEquals;

public class TreasureTest {

    Treasure treasure;

    @Before
    public void before(){
        treasure = new Treasure(TreasureType.GOLD);
    }

    @Test
    public void checkConsturcot(){
        assertEquals(200, treasure.getTreasureValue());
        assertEquals("Gold", treasure.getTreasureName());
    }
}
