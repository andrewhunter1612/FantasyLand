package people_test;

import org.junit.Before;
import org.junit.Test;
import people.PlayerImplementation;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    PlayerImplementation player;

    @Before
    public void before() {
        player = new PlayerImplementation("John");
    }

    @Test
    public void playerHasName() {
        assertEquals("John", player.getName());
    }

    @Test
    public void playerHasHealthPoints() {
        assertEquals(100, player.getHealthPoints());
    }
}
