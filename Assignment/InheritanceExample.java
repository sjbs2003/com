package com.Assignment;

class Reptile {
    public void eat() {
        System.out.println("Reptile is eating.");
    }
}
class Snake extends Reptile {
    public void sound() {
        System.out.println("Snake is rattling/hissing.");
    }
}
class Anaconda extends Snake {
    public void crawl() {
        System.out.println("Anaconda is slithering.");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Anaconda anaconda = new Anaconda();
        anaconda.eat();
        anaconda.sound();
        anaconda.crawl();
    }
}

