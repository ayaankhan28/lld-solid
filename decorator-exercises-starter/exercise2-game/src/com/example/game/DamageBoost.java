package com.example.game;

public class DamageBoost extends CharacterDecorator {
    private final int damageBonus;

    public DamageBoost(Character character, int damageBonus) {
        super(character);
        this.damageBonus = damageBonus;
    }

    @Override
    public int getDamage() {
        return super.getDamage() + damageBonus;
    }

    @Override
    public void attack() {
        System.out.println("Attacking with enhanced damage " + getDamage() + " using sprite " + getSprite());
    }
}
