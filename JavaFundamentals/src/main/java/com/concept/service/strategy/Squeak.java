package com.concept.service.strategy;

public class Squeak implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Squeak Squeak.....");
    }
}
