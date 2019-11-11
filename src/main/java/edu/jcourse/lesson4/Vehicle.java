package edu.jcourse.lesson4;

class Vehicle {
    public Vehicle() {
    }

    String name;
    int passengers;
    int tank;
    float fuelPer100km;

    public Vehicle(String name,int tank,int passengers,float fuelPer100km) {
        this.name=name;
        this.tank=tank;
        this.fuelPer100km=fuelPer100km;
        this.passengers=passengers;
    }

    void distance()
    {

        float distance =  (tank*100)/fuelPer100km;
        System.out.println(distance);
        System.out.println("Для "+name+" приемлимое растояние "+distance+"km");
    }
}
