package edu.jcourse.lesson5;

public /*final*/ class Circle {
    private float radius;
    private final float PI=3.14F;
    private final int MEMBERS=7;


    public float area()
    {
        return MEMBERS*(radius+radius);
    }
    public float getRadius(){ return radius; }
    public void setRadius(float radius){this.radius=radius;}
}
