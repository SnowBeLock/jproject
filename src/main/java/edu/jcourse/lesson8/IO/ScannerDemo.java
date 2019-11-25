package edu.jcourse.lesson8.IO;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
//        Scanner bts = new Scanner("Naega\n"+"Tobue\n"+"Ilpam\n");
//      while (bts.hasNext()){
//          System.out.println(bts.nextLine());
//       }

        Scanner stringScanner = new Scanner(System.in);
        int input1=stringScanner.nextInt();
        int input2 = stringScanner.nextInt();
        int sum=input1+input2;
        System.out.println(sum);

   }
}
