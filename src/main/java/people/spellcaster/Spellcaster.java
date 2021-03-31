package people.spellcaster;

import behaviours.IDamage;
import people.Player;

public class Spellcaster extends Player {
    private SpellcasterType spellcasterType;
    private IDamage spell;
    private CreatureType creature;

    public Spellcaster(String name, SpellcasterType spellcasterType, IDamage spell, CreatureType creature) {
        super(name);
        this.spellcasterType = spellcasterType;
        this.spell = spell;
        this.creature = creature;
    }
}
