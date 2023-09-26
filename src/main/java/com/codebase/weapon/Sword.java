package com.codebase.weapon;

import com.codebase.enemy.Enemy;
import com.codebase.weapon.Weapon;
import com.codebase.weapon.WeaponType;

public class Sword extends Weapon {
    public Sword( WeaponType weaponType) {
        super( weaponType);
    }

    @Override
    public String attack(Enemy enemy) {
        enemy.takeDamage(this);
        return String.format("You slashed the enemy for %s damage. Enemy has %s health remaining.",this.getDamage(), enemy.getHealthPoints() );
    }
}
