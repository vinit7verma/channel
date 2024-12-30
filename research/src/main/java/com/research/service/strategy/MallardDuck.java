package com.research.service.strategy;

public class MallardDuck extends Duck {

    MallardDuck() {
        this.qb = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a Mallard Duck.");
    }
}
