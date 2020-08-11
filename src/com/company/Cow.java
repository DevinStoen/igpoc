package com.company;

import com.company.Animal;

public class Cow implements Animal {
    @Override
    public void speak() {
        System.out.println("Moo");
    }

    @Override
    public void travel() {
        System.out.println("Walk");
    }
}
