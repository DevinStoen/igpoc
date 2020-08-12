package com.company;

public class Main {

    public static void main(String[] args) {

        strategyPattern();

    }

    public static void strategyPattern(){
        System.out.println("Hello World");
        Animal cow = new Cow();

        Animal bird = new Bird();

        cow.speak();
        bird.travel();
    }


}
