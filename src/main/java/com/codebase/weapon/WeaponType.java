package com.codebase.weapon;

public enum WeaponType {
    AXE("Axe",7),
    CLUB("Club",5),
    SWORD("Sword",10);

    private final String weaponType;
    private final int damage;
    WeaponType(String weaponType, int damage) {
        this.weaponType = weaponType;
        this.damage = damage;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public int getDamage() {
        return damage;
    }
}
