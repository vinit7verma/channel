package com.concept.service.strategy;

public class FlyWithWings implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("I am flying.");
    }
}
