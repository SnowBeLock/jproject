package edu.jcourse.lesson11;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileDemo {
    public static void main(String[] args) {
        saveFile();
        List<String> result = loadResults();
        PrintResults(result);
    }


    private static void saveFile() {
        File file = new File("simple_file.txt");
        try {
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.println("bts");
            printWriter.println("txt");
            printWriter.println("BigHit");
            printWriter.println("SKor");
            printWriter.close();

        } catch (IOException e) {
            System.out.println();
        }

    }

    private static void printResult() {
        File file = new File("simple_file.txt");
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException i) {
            System.out.println("Can no read");
        }
    }


    private static ArrayList<String> loadResults() {
        ArrayList<String> result = new ArrayList<>();
        File file = new File("simple_file.txt");
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                result.add(line);

            }
        } catch (IOException e) {
            System.out.println("error");
        }
        return result;
    }

    public static void PrintResults(List<String> result) {

        for (String r : result) {
            System.out.println(r);
        }
    }
}
