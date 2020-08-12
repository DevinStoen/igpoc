package com.company;

public class Cow extends Animal {
    public Cow(){
        speakBehavior = new MooBehavior();
        travelBehavior = new WalkBehavior();
    }
}
