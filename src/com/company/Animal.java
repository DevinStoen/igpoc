package com.company;

public abstract class Animal {

    ISpeakBehavior speakBehavior = null;
    ITravelBehavior travelBehavior = null;

    public void speak(){
        // null check
        speakBehavior.speak();
    }

    public void travel(){
        travelBehavior.travel();
    }

}
