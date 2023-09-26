package com.codebase.player.mage;

public class Warlock extends Mage {

    public Warlock(String name, int healthPoints) {
        super(name, healthPoints);
    }

    @Override
    public String cast(){
        return "The warlock has casted a spell!";
    }

    @Override
    public String defend() {
        return "The warlock blocked the attack!";
    }
}
