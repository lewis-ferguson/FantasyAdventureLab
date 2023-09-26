package com.codebase.weapon;

public class Axe extends Weapon {
    public Axe(int damage, WeaponType weaponType) {
        super(damage, weaponType);
    }

    @Override
    public String attack() {
        return "Hack";
    }
}
