package com.codebase.weapon;

public class Club extends Weapon {
    public Club( WeaponType weaponType) {
        super( weaponType);
    }

    @Override
    public String attack() {
        return "Bash";
    }


}
