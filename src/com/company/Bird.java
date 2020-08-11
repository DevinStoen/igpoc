package com.company;

import com.company.Animal;

public class Bird implements Animal {
    @Override
    public void speak() {
        System.out.println("Chirp");
    }

    @Override
    public void travel() {
        System.out.println("Fly");
    }
}
