package com.codebase;

public class Club extends Weapon{
    public Club(int damage, WeaponType weaponType) {
        super(damage, weaponType);
    }

    @Override
    public String attack() {
        return "Bash";
    }


}
