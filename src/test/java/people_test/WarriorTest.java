package people_test;

import org.junit.Before;
import org.junit.Test;
import people.warrior.Warrior;
import people.warrior.WarriorType;
import people.warrior.WeaponType;

import static org.junit.Assert.assertEquals;

public class WarriorTest {

    Warrior warrior;

    @Before
    public void before() {
        warrior = new Warrior("Bob", WarriorType.DWARF, WeaponType.AXE);
    }

    @Test
    public void warriorHasName() {
        assertEquals("Bob", warrior.getName());
    }

    @Test
    public void warriorHasType() {
        assertEquals("Dwarf", warrior.getWarriorType());
    }

    @Test
    public void warriorHasWeapon() {
        assertEquals("Axe", warrior.getWeaponType());
    }
}
