package com.Assignment;

interface car {
    void makeSound();
}
class Dodge implements car {
    public void makeSound() {
        System.out.println("Vroom.");
    }
}
class Caterpillar implements car {
    public void makeSound() {
        System.out.println("growl.");
    }
}
public class PQ3 {
    public static void main(String[] args) {
        car dodge = new Dodge();
        car caterpillar = new Caterpillar();
        dodge.makeSound();
        caterpillar.makeSound();
    }
}

