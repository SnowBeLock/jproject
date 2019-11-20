package edu.jcourse.lesson8;

public class StaticDemo {
    public static void main(String[] args) {
        float r=10;
        float circleArea=MathConstants.PI*(r*r);

        System.out.println(MathConstants.sum(2,1));
        System.out.println(circleArea);
        String b="Karina,Is,Better,Than,Monika";
        String[] s=b.split(",");
        for (int i = 0; i <s.length ; i++) {
            System.out.println();
        }
    }
}
