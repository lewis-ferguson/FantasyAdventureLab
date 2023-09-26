package com.codebase.weapon;

public enum WeaponType {
    AXE("Axe"),
    CLUB("Club"),
    SWORD("Sword");

    private final String weaponType;
    WeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    public String getWeaponType() {
        return weaponType;
    }
}
