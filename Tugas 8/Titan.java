/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas8;

/**
 *
 * @author Yasminn 
 */
public class Titan extends Chara {
    private int defense;
    private int attack;
    private int HP;
 
    Titan(int defense, int attack, int HP){
        super(defense, attack, HP);
        this.defense = defense;
        this.attack = attack;
        this.HP = HP;
    }
    public boolean attack(){
        double Hit = Math.random();
        if(Hit < 0.40) {
        return true;
    }
    return false;
    }  
}
