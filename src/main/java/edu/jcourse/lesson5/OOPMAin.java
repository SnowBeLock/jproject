package edu.jcourse.lesson5;

public class OOPMAin {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setName("Kim Namjoon");
        animal.SayHello();

        Animal cat = new Cat();
        cat.setName("Evgeny");
        cat.SayHello();
        cat.setAge(37);
        cat.SayAge();

        Dog dog = new Dog();
        dog.setName("Enoke");
        dog.SayHello();
        dog.setAge(5);
        dog.SayAge();
        dog.sayHello("Morning|");

        if(cat instanceof Animal)
        {
            System.out.println(animal);
        }

    }
}


