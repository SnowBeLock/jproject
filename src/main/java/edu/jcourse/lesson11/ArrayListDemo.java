package edu.jcourse.lesson11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Namjoon");
        list.add("V");
        list.add("Hoesoek");
        list.add("Jin");
        list.add("Jungkook");
        list.add("suga");
        list.add("jimin");
        System.out.println("All singers:");
        forCyclePrinter(list);
        list.remove(2);
        //list.add(1,"The greatest leader Namjoon");
        System.out.println("Useful singers:");
        forCyclePrinter(list);
    }
    public static void forCyclePrinter(List<String>list)
    {
        for (String s : list) {
            System.out.println(s);
        }
    }
}
