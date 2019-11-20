package edu.jcourse.lesson8.stringDemo;

public class StringDemo {
    public static void main(String[] args) {
        String str1 = new String("hello Java");
        String str2 = "hello java";
        boolean isEqual = str1.equalsIgnoreCase(str2);
        System.out.println(isEqual);

        int jIndex = str1.indexOf(" ")+1;
        if (jIndex > 0) {
            System.out.println(jIndex);
        }
        String substring = str1.substring(jIndex,str1.length()-2); //Mi nichego ne otrezali on str1
        System.out.println(substring.trim());
        System.out.println(str1.contains("Java"));
    }
}
