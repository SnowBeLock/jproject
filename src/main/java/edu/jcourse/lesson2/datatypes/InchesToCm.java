package edu.jcourse.lesson2.datatypes;

public class InchesToCm {
    public static void main(String[] args) {
        double doubleInches=Double.parseDouble(args[0]);
        double doubleCm=doubleInches*2.54F;
        System.out.println("Result with double "+doubleCm);
    }
}
