package edu.jcourse.lesson7.AbstractClass.InterfaceDemo;

public class InterfaceMain  {
    public static void main(String[] args) {
        MyInterface myInterface1=new MyInterfaceImpl();
        MyInterface myInterface2=new MyInterfaceImpl2();
        System.out.println(myInterface2.calculusDistanto()/myInterface1.calculusDistanto()+myInterface1.calculusDistanto()*myInterface1.calculusDistanto());
        System.out.println(myInterface2.calculusDistanto());
    }
}
