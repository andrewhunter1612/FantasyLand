package people.warrior;

import behaviours.Fighter;
import people.Player;

public class Warrior extends Player implements Fighter {
    private WarriorType warriorType;
    private WeaponType weaponType;

    public Warrior(String name, WarriorType warriorType, WeaponType weaponType) {
        super(name);
        this.warriorType = warriorType;
        this.weaponType = weaponType;
    }

    public String getWarriorType() {
        return warriorType.getWarriorType();
    }

    public String getWeaponType() {
        return weaponType.getWeapon();
    }

    @Override
    public int attack() {
        return this.weaponType.getDamage();
    }
}
