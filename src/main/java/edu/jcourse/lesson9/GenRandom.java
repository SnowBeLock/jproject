package edu.jcourse.lesson9;

import java.util.Random;

public class GenRandom {
    public static void main(String[] args) {
        //MS from 1970-01-01 00:00
        System.out.println(System.currentTimeMillis());
        for (int i = 0; i <9 ; i++) {

            Random rand=new Random(4);
            int randomInt=rand.nextInt(100)+1;
            System.out.println(randomInt);
        }

    }
}
