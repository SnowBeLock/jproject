package edu.jcourse.lesson8.IO;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
//        Scanner bts = new Scanner("Naega\n"+"Tobue\n"+"Ilpam\n");
////       while (bts.hasNext()){
////           System.out.println(bts.nextLine());
////       }

        Scanner stringScanner = new Scanner(System.in);
        System.out.println("A:"+stringScanner.next());
        System.out.println("B:"+stringScanner.next());
   }
}
