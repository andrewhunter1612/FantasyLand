package people.spellcaster;

import behaviours.IDamage;
import people.Player;

public class Spellcaster extends Player {
    private SpellcasterType spellcasterType;
    private SpellType spell;
    private CreatureType creature;

    public Spellcaster(String name, SpellcasterType spellcasterType, SpellType spell, CreatureType creature) {
        super(name);
        this.spellcasterType = spellcasterType;
        this.spell = spell;
        this.creature = creature;
    }

    public void changeSpell(SpellType spell) {
        this.spell = spell;
    }

    public void changeCreature(CreatureType creature) {
        this.creature = creature;
    }

    public SpellcasterType getSpellcasterType() {
        return spellcasterType;
    }

    public SpellType getSpell() {
        return spell;
    }

    public CreatureType getCreature() {
        return creature;
    }
}
