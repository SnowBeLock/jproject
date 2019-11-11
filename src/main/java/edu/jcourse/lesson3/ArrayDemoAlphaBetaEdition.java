package edu.jcourse.lesson3;
public class ArrayDemoAlphaBetaEdition {

    public static void main(String[] args) {
        int a[] = new int[10];

        for (int i = 0; i < 10; i++) {
            a[i] = i;
        }

        for (int i = 9; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }
}