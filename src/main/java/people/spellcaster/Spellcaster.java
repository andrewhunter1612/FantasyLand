package people.spellcaster;

import people.Player;

public class Spellcaster extends Player {
    private SpellcasterType spellcasterType;
    private SpellType spell;
    private CreatureType creature;

    public Spellcaster(String name, SpellcasterType spellcasterType, CreatureType creature) {
        super(name);
        this.spellcasterType = spellcasterType;
        this.spell = null;
        this.creature = creature;
    }

    public int attack(SpellType spellType){
        return spellType.getDamage();
    }

    public void changeCreature(CreatureType creature) {
        this.creature = creature;
    }

    public String getSpellcasterType() {
        return spellcasterType.getName();
    }

    public String getSpell() {
        return spell.getName();
    }

    public String getCreature() {
        return creature.getName();
    }
}
