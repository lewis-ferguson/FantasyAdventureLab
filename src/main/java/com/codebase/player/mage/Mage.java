package com.codebase.player.mage;

import com.codebase.player.Player;

public abstract class Mage extends Player implements IDefend, ISpell {
    public Mage(String name, int healthPoints) {
        super(name, healthPoints);
    }

}
