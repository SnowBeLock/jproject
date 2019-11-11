package edu.jcourse.lesson2.datatypes;

public class BoolDemo {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        if(a<b){
            System.out.println(a+"<"+b);
        }
        if(a>b)
        {
            System.out.println(a+">"+b);
        }
        if(a==b)
        {
            System.out.println(a+"="+b);
        }
       /* boolean b=false;
        int a=10;
        int b=20;
        if(a>=b)
        {
            System.out.println("cry");
        }
        else(b>a)
        System.out.println("b is "+b);
        b=true;
        System.out.println("b is now "+b);
        if(b){
            System.out.println("yes");
        }
        //b=false;
        if(b)
        {
            System.out.println("nope");
        }
        System.out.println("10>9"+(10>9));
    }*/
    }
}
