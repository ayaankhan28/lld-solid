package com.example.game;

public class GoldenAura extends CharacterDecorator {
    private static final int AURA_SPEED_BONUS = 2;
    private static final int AURA_DAMAGE_BONUS = 5;

    public GoldenAura(Character character) {
        super(character);
    }

    @Override
    public String getSprite() {
        return "golden_" + super.getSprite();
    }

    @Override
    public int getSpeed() {
        return super.getSpeed() + AURA_SPEED_BONUS;
    }

    @Override
    public int getDamage() {
        return super.getDamage() + AURA_DAMAGE_BONUS;
    }

    @Override
    public void move() {
        System.out.println("[Golden Aura active]");
        System.out.println("Moving with divine speed " + getSpeed() + " with sprite " + getSprite());
    }

    @Override
    public void attack() {
        System.out.println("[Golden Aura active]");
        System.out.println("Attacking with divine power " + getDamage() + " using sprite " + getSprite());
    }
}
