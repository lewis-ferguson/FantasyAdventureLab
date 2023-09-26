package com.codebase;

public abstract class Enemy {
    private int healthPoints;

    public void takeDamage(Weapon weapon) {
        this.healthPoints -= weapon.getDamage();
    }
}
