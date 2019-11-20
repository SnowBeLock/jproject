package edu.jcourse.Hw1;

public class Human extends Characters {
    @Override
    public float AttackDamageWithoutWeapon() {
        return getDamage();
    }

    @Override
    public float AttackDamageWithWeapon() {
        return getDamage()+getWeaponDamage();
    }

    @Override
    public void SaySomething() {
        System.out.println("Hello!");
    }
}
