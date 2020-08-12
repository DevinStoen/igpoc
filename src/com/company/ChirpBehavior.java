package com.company;

public class ChirpBehavior implements ISpeakBehavior {
    @Override
    public void speak() {
        System.out.println("Chirp");
    }
}
