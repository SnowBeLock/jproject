package edu.jcourse.lesson5;

public class CircleMain {
    public static void main(String[] args) {
        Circle circle1=new Circle();
        circle1.setRadius(314);
        float area=circle1.area();
        System.out.println(area);
        Circle circle2=new Circle();
        circle2.setRadius(10);
        float area2=circle2.area();
        System.out.println(area2);
        System.out.println(area/area2);
    }
}
