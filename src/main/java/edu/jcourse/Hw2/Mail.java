package edu.jcourse.Hw2;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mail {
    public static void main(String[] args) {
        fileCreate();
        printResult();

    }
    public static void fileCreate() {
        File Mail = new File("Mail.txt");
        try {
            PrintWriter printWriter = new PrintWriter(Mail);
            printWriter.println("bts@gmail.com");
            printWriter.println("jin@inbox.lv");
            printWriter.println("jimin@apollo.lv");
            printWriter.println("jungkook@mail.ru");
            printWriter.println("v@korean.kor");
            printWriter.println("rapmon@rapper.com");
            printWriter.println("jhope@rapper.lv");
            printWriter.println("a@gmail.com");
            printWriter.println("b@inbox.lv");
            printWriter.println("c@apollo.lv");
            printWriter.println("army@fan.kor");
            printWriter.println("d@letonia.lv");
            printWriter.println("e@youtube.com");
            printWriter.println("f@g.h");
            printWriter.println("i@j.k");
        } catch (IOException e) {
            System.out.println("Mistake");
        }
    }

        private static void printResult() {
        File Mail = new File("Mail.txt");
        try (Scanner scanner = new Scanner(Mail)) {
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine().endsWith("@"));
            }
        } catch (IOException i) {
            System.out.println("Can't read");
        }
    }
    }

