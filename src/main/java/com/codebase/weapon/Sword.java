package com.codebase.weapon;

import com.codebase.weapon.Weapon;
import com.codebase.weapon.WeaponType;

public class Sword extends Weapon {
    public Sword(int damage, WeaponType weaponType) {
        super(damage, weaponType);
    }

    @Override
    public String attack() {
        return "Slash";
    }
}
