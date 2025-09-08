package com.example.game;

public class SpeedBoost extends CharacterDecorator {
    private final int speedBonus;

    public SpeedBoost(Character character, int speedBonus) {
        super(character);
        this.speedBonus = speedBonus;
    }

    @Override
    public int getSpeed() {
        return super.getSpeed() + speedBonus;
    }

    @Override
    public void move() {
        System.out.println("Moving at enhanced speed " + getSpeed() + " with sprite " + getSprite());
    }
}
