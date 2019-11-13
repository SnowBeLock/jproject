package edu.jcourse.lesson7.AbstractClass;

public class Bus extends Vehicle {
    @Override
    public float distanceCityMode() {
        return (getTank()*150/getFuelPer100km());
    }

    @Override
    public float distanceHighwayMode() {
        return (getTank()*150/getFuelPer100km()-5F);
    }
}
