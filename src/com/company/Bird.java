package com.company;

public class Bird extends Animal {
    public Bird(){
        speakBehavior = new ChirpBehavior();
        travelBehavior = new FlyBehavior();
    }

}
