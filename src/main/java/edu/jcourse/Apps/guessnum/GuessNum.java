package edu.jcourse.Apps.guessnum;

import java.util.Random;
import java.util.Scanner;

public class GuessNum {
    public static void main(String[] args) {

        Random random = new Random();
        int randomInt = random.nextInt(100);

        System.out.println("Enter the numeral from 1 to 100");

        Scanner playerNumeral = new Scanner(System.in);


        for (int i = 0; i < 10; i++) {
            int input = playerNumeral.nextInt();
            if (input > randomInt) {
                System.out.println("The numeral is lower");
            }
            if (input < randomInt) {
                System.out.println("The numeral is higher");
            }
            if (input == randomInt) {
                System.out.println("You are extrasense!!!!");
                break;
            }
        }

    }
}
