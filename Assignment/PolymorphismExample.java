package com.Assignment;
class Animal {
    public void makeSound() {
        System.out.println("Animal is making a sound.");
    }
}
class Dog extends Animal {
    public void makeSound() {
        System.out.println("Dog is barking.");
    }
}
class Cat extends Animal {
    public void makeSound() {
        System.out.println("Cat is meowing.");
    }
}


public class PolymorphismExample {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Dog();
        Animal animal3 = new Cat();

        animal1.makeSound();
        animal2.makeSound();
        animal3.makeSound();
    }
}
