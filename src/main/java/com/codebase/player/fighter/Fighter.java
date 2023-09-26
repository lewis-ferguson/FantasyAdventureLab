package com.codebase.player.fighter;

import com.codebase.player.Player;
import com.codebase.weapon.Weapon;

public abstract class Fighter extends Player {

    private Weapon weapon;
    public Fighter(String name, int healthPoints, Weapon weapon) {
        super(name, healthPoints);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }


}
