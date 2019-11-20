package edu.jcourse.Hw1;

public class AbstractStarWars {
    public static void main(String[] args) {
        Characters HanSolo=new Human();

        HanSolo.setDamage(10);
        HanSolo.setName("Han Solo");
        HanSolo.setPlanet("Korellia");
        HanSolo.setRace("Human");
        HanSolo.setWeaponDamage(5);
        float HanSoloDamage = HanSolo.damage(true);
        HanSolo.SaySomething();
        System.out.println("Han's damage is equal to: "+HanSoloDamage);

        Characters Jabba=new Hutt();

        Jabba.setRace("Hutt");
        Jabba.setName("Jabba");
        Jabba.setPlanet("Nal Hutta");
        Jabba.setDamage(12);
        Jabba.SaySomething();
        float JabbaDamage=Jabba.damage(false);
        System.out.println("Jabba's damage is equal to: "+JabbaDamage);

        Characters Chewbacca=new Wookiee();
        Chewbacca.setDamage(20);
        Chewbacca.setWeaponDamage(25);
        Chewbacca.setRace("Wookiee");
        Chewbacca.setPlanet("Kashyyyk");
        Chewbacca.setName("Chewbacca");
        Chewbacca.SaySomething();
        float chewbaccaDamahe=Chewbacca.damage(true);
        System.out.println(chewbaccaDamahe);
    }
}
