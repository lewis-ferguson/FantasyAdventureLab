package com.codebase.player.cleric;

import com.codebase.interfaces.IHeal;
import com.codebase.player.Player;

public class Cleric extends Player implements IHeal{
    public Cleric(String name, int healthPoints) {
        super(name, healthPoints);
    }

    @Override
    public String heal() {
        return "The cleric has healed your battle wounds!";
    }
}
