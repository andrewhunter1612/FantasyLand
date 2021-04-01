package people.cleric;

import behaviours.Healer;
import people.Player;

public class Cleric extends Player implements Healer {
    private HealingType healingType;

    public Cleric(String name, HealingType healingType) {
        super(name);
        this.healingType = healingType;
    }

    public String getHealingType() {
        return healingType.getName();
    }

    public void setHealingType(HealingType healingType) {
        this.healingType = healingType;
    }

    @Override
    public int heal() {
        return this.healingType.getHealing();
    }
}
