package people.cleric;

import people.Player;

public class Cleric extends Player{
    private HealingType healingType;

    public Cleric(String name) {
        super(name);
        this.healingType = null;
    }

    public String getHealingType() {
        return healingType.getName();
    }

    public void setHealingType(HealingType healingType) {
        this.healingType = healingType;
    }

}
