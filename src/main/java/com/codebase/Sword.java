package com.codebase;

public class Sword extends Weapon{
    public Sword(int damage, WeaponType weaponType) {
        super(damage, weaponType);
    }

    @Override
    public String attack() {
        return "Slash";
    }
}
