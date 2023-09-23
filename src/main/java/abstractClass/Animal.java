package abstractClass;

import java.util.List;

public abstract class Animal {
    int age;
    String name;

    Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public abstract void makeNoise();

    public void printName() {
        System.out.println("My name is: " + name);
    }
}