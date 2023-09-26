package com.codebase.weapon;

import com.codebase.weapon.Weapon;
import com.codebase.weapon.WeaponType;

public class Sword extends Weapon {
    public Sword( WeaponType weaponType) {
        super( weaponType);
    }

    @Override
    public String attack() {
        return "Slash";
    }
}
