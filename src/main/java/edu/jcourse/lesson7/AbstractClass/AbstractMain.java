package edu.jcourse.lesson7.AbstractClass;

public class AbstractMain {
    public static void main(String[] args) {
        Vehicle sportCar = new SportCar();
        sportCar.setTank(30);
        sportCar.setFuelPer100km(7.5F);
        float sportCarDistance=sportCar.distance(true);
        System.out.println(sportCarDistance);
        Vehicle bus = new Bus();
        bus.setFuelPer100km(5);
        bus.setTank(40);
        float busDistance = bus.distance(false);
        System.out.println(busDistance);
        Vehicle drandulet = new Bus();
        drandulet.setTank(1337);
        drandulet.setFuelPer100km(200);
        float dranduletDistance =drandulet.distance(false);
        System.out.println(dranduletDistance);
    }
}
