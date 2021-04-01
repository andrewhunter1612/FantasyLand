package people_test;

import org.junit.Before;
import org.junit.Test;
import people.cleric.Cleric;
import people.cleric.HealingType;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;

    @Before
    public void before() {
        cleric = new Cleric("Harrison", HealingType.CALPOL);
    }

    @Test
    public void hasName() {
        assertEquals("Harrison", cleric.getName());
    }

    @Test
    public void hasHealth() {
        assertEquals(100, cleric.getHealthPoints());
    }

    @Test
    public void hasHealer() {
        cleric.setHealingType(HealingType.CALPOL);
        assertEquals("Calpol", cleric.getHealingType());
    }
}
