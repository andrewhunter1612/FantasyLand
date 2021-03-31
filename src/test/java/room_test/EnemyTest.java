package room_test;

import org.junit.Before;
import org.junit.Test;
import room.enemy.Enemy;
import room.enemy.EnemyType;

import static org.junit.Assert.assertEquals;

public class EnemyTest {

    Enemy enemy;

    @Before
    public void before(){
        enemy = new Enemy(EnemyType.INSTRUCTOR);
    }

    @Test
    public void checkConstructor(){
        assertEquals(100, enemy.getEnemyHealth());
        assertEquals("Instructor", enemy.getEnemyName());
        assertEquals(20, enemy.getEnemyDamage());
        enemy.loseHealth(30);
        assertEquals(70, enemy.getEnemyHealth());
    }
}
