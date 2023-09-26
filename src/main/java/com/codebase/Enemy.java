package com.codebase;

public abstract class Enemy {
    private int healthPoints;

    public Enemy(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void takeDamage(Weapon weapon) {
        this.healthPoints -= weapon.getDamage();
    }


}
