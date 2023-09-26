package com.codebase.weapon;

import com.codebase.enemy.Enemy;

public class Club extends Weapon {
    public Club( WeaponType weaponType) {
        super( weaponType);
    }

    @Override
    public String attack(Enemy enemy) {
        enemy.takeDamage(this);
        return String.format("You bashed the enemy for %s damage. Enemy has %s health remaining.",this.getDamage(), enemy.getHealthPoints() );
    }


}
