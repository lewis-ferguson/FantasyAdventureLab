package com.codebase.weapon;

public class Axe extends Weapon {
    public Axe( WeaponType weaponType) {
        super(weaponType);
    }

    @Override
    public String attack() {
        return "Hack";
    }
}
