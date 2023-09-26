package com.codebase.player.mage;

public class Wizard extends Mage{

    public Wizard(String name, int healthPoints) {
        super(name, healthPoints);
    }

    @Override
    public String cast(){
        return "The wizard has casted a spell";
    }

    @Override
    public String defend() {
        return "The wizard blocked the attack!";
    }
}
