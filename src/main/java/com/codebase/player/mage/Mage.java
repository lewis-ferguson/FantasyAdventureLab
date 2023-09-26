package com.codebase.player.mage;

import com.codebase.interfaces.IDefend;
import com.codebase.interfaces.ISpell;
import com.codebase.player.Player;

public abstract class Mage extends Player implements IDefend, ISpell {
    public Mage(String name, int healthPoints) {
        super(name, healthPoints);
    }


}
