package edu.jcourse.lesson5;

public class Animal {



    private String name;
    private int age;
    public void SayHello()
    {
        System.out.println(name +" sings Ed Sheeran song!");
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age)
    {
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Animal(String name, int age){
        this.name=name;
        this.age=age;

    }
    public Animal(){}
    public void sayHello(String hello)
    {
        System.out.println(hello);
    }
    public void SayAge()
    {
        System.out.println(age);
    }

    @Override
    public String toString() {
        return getName() + String.valueOf(age);
    }



}
