package com.ivannikov.oop.lesson15;

public class Warrior extends Hero{


    public Warrior(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " бьет мечем " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
