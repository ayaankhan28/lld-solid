package com.example.game;

public class GameDemo {
    public static void main(String[] args) {
        Character base = new BaseCharacter();

        System.out.println("=== Base Character ===");
        base.move();
        base.attack();

        // Base + SpeedBoost + DamageBoost
        System.out.println("\n=== Buffed Character (Speed +3, Damage +15) ===");
        Character buffed = new DamageBoost(new SpeedBoost(base, 3), 15);
        buffed.move();
        buffed.attack();

        // Add GoldenAura to the buffed character
        System.out.println("\n=== Golden Aura Added ===");
        Character shiny = new GoldenAura(buffed);
        shiny.move();
        shiny.attack();

        // Remove GoldenAura by recomposing
        System.out.println("\n=== Golden Aura Removed (back to just buffs) ===");
        Character withoutAura = buffed; // removal by recomposition
        withoutAura.move();
        withoutAura.attack();
    }
}