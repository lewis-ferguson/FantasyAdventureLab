package com.codebase.weapon;

public abstract class Weapon implements IWeapon {
    private int damage;
    private WeaponType weaponType;

    public Weapon(int damage, WeaponType weaponType) {
        this.damage = damage;
        this.weaponType = weaponType;
    }

    public int getDamage() {
        return damage;
    }

    public String getWeaponType() {
        return weaponType.getWeaponType();
    }
}
