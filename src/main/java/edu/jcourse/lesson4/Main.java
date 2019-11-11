package edu.jcourse.lesson4;

public class Main {
    public static void main(String[] args) {
        Vehicle miniVan=new Vehicle();
        miniVan.fuelPer100km=1.54F;
        miniVan.tank=451;
        miniVan.passengers=999;

        Vehicle sportCar = new Vehicle("Ferarri",200,1,10);
        sportCar.passengers=1;
        sportCar.fuelPer100km=86950;

        Vehicle dedovDrandulet = new Vehicle("Drandulet",100,6,5.5F);
         dedovDrandulet.tank=100000;
        dedovDrandulet.fuelPer100km=1020;
        dedovDrandulet.passengers=3;
        System.out.println("MiniVan"+miniVan.passengers+miniVan.fuelPer100km+miniVan.tank);
        System.out.println("Sport car "+ sportCar.tank+sportCar.fuelPer100km+sportCar.passengers);
        dedovDrandulet.distance();
    }
}
