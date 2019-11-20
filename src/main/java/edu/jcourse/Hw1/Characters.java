package edu.jcourse.Hw1;

public abstract class Characters {
    private String name;
    private String race;
    private String planet;
    private float weaponDamage;
    private float damage;

    public abstract float AttackDamageWithoutWeapon();
    public abstract float AttackDamageWithWeapon();
    public abstract void SaySomething();

    public float damage(boolean withWeapon)
    {
        if(withWeapon)
        {
            return AttackDamageWithWeapon();
        }
        else
        {
            return AttackDamageWithoutWeapon();
        }
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public float getWeaponDamage() {
        return weaponDamage;
    }

    public void setWeaponDamage(float weaponDamage) {
        this.weaponDamage = weaponDamage;
    }

    public String getPlanet() {
        return planet;
    }

    public void setPlanet(String planet) {
        this.planet = planet;
    }

    public float getDamage() {
        return damage;
    }

    public void setDamage(float damage) {
        this.damage = damage;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }
}



