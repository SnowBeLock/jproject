package edu.jcourse.Apps.guessnum;

import java.nio.channels.ScatteringByteChannel;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessNum {
    static Scanner playerNumeral = new Scanner(System.in);

    public static void main(String[] args) {
        Random random = new Random();
        int randomInt = random.nextInt(100);
        boolean isLooser = true;
        for (int i = 0; i < 10; i++) {
            int input = askNum(i + 1);
            if (i == 9) {
                System.out.println("try again?");

                String answer = playerNumeral.next();
                if (answer.equals("yes")) {
                    i = 0;
                }
                if (answer.equals("no")) {
                    System.out.println("Bye, see you later!");
                    break;
                }
            } else {
                if (input > randomInt) {
                    System.out.println("The numeral is lower!  ");
                }
                if (input < randomInt) {
                    System.out.println("The numeral is higher! ");
                }
                if (input == randomInt) {
                    isLooser = false;
                    System.out.println("You are extrasense!!!!");
                    break;
                }
            }
        }
        if (isLooser) {
            System.out.println("You Lost!");
        }
    }

    static int askNum(int tryNr) {
        while (true) {
            try {
                System.out.printf("try #%d. Enter the numeral from 1 to 100", tryNr);
                int input = playerNumeral.nextInt();
                if (input < 1 || input > 100) {
                    System.out.println("Wrong number");
                } else {
                    return input;
                }
            } catch (InputMismatchException e) {
                System.out.println("It is not a number(((");
                playerNumeral.next();
            }
        }
    }
}
