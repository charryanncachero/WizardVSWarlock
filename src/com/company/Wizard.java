package com.company;

public class Wizard extends Character{
    //Wizard constructor inherits character class
    Wizard(String name, int lvl, int hp, int mana){
        super(name,lvl,hp,mana);
    }
    //Wizard Skills method class
    //Wizard skill no.1 with damage and mana reduction upon cast
    public void fireStorm(Character enemyCharacter, Character name){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Firestorm (Damage - 50)");
        int damagePoints = 50;
        int manadecrease = 35;
        damageTarget(enemyCharacter,damagePoints,manadecrease,name);
    }

    //Wizard skill no.2 Self-heal(Health Points Increase)
    public void healingpool(){
        super.healthPoints += 50;
        System.out.println(super.characterName + " Health restored + 50hp");
    }
    //Wizard skill no.3 with damage and mana reduction upon cast
    public void fireBolt(Character enemyCharacter, Character name){
        int damagePoints = 40;
        int manadecrease = 30;
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Firebolt (Damage - 40)");
        damageTarget(enemyCharacter,damagePoints,manadecrease,name);
    }
}
