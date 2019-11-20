package edu.jcourse.Hw1;

public class Hutt extends Characters{
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
        System.out.println("H'chu apenkee!");
    }
}
