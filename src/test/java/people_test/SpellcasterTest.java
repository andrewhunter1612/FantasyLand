package people_test;

import org.junit.Before;
import org.junit.Test;
import people.spellcaster.CreatureType;
import people.spellcaster.Spellcaster;
import people.spellcaster.SpellcasterType;

import static org.junit.Assert.assertEquals;

public class SpellcasterTest {

    Spellcaster spellcaster;

    @Before
    public void before() {
        spellcaster = new Spellcaster("Billy", SpellcasterType.WIZARD, CreatureType.OGRE);
    }

    @Test
    public void spellCasterHasName() {
        assertEquals("Billy", spellcaster.getName());
    }

    @Test
    public void spellCasterHasHealth() {
        assertEquals(100, spellcaster.getHealthPoints());
    }

    @Test
    public void hasType() {
        assertEquals("Wizard", spellcaster.getSpellcasterType());
    }

    @Test
    public void hasCreature() {
        assertEquals("Ogre", spellcaster.getCreature());
    }
}
