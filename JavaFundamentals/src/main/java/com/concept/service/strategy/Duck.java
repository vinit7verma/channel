package com.concept.service.strategy;

public abstract class Duck {
    FlyBehaviour fb;
    QuackBehaviour qb;

    public abstract void display();

    public void fly() {
        this.fb.fly();
    }

    public void quack() {
        this.qb.quack();
    }

    public void swim() {
        System.out.println("I am swimming.");
    }

    public void setFlyingBehavior(FlyBehaviour fb) {
        this.fb = fb;
    }
}
