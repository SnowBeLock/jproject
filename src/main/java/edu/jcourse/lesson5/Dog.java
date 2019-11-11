package edu.jcourse.lesson5;

public class Dog extends Animal {

    @Override
    public void SayHello() {
        super.sayHello("im not");
        System.out.println(getName()+" wants a bone");
    }

    @Override
    public void SayAge() {
        System.out.println("AMA "+getAge()+" STUPIT DOK");
    }
}
