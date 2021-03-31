package people.warrior;

import people.Player;

public class Warrior extends Player {
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
}
