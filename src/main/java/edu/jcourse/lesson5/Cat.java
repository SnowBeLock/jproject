package edu.jcourse.lesson5;

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(String name, int age){
        super(name,age);
    }
    @Override
    public void SayHello() {
        System.out.println(getName()+" is better than dog");
    }

    @Override
    public void SayAge() {
        System.out.println("Intelegent "+getAge()+" years old cat");
    }
    protected void finalize()
    {
        System.out.println("Finalize class");
    }
}
