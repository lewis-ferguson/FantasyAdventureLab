package com.codebase.weapon;

import com.codebase.interfaces.IWeapon;

public abstract class Weapon implements IWeapon {
    private int damage;
    private WeaponType weaponType;

    public Weapon( WeaponType weaponType) {
        this.damage = weaponType.getDamage();
        this.weaponType = weaponType;
    }

    public int getDamage() {
        return damage;
    }

    public String getWeaponType() {
        return weaponType.getWeaponType();
    }
}
