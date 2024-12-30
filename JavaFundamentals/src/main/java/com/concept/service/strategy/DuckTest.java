package com.concept.service.strategy;

public class DuckTest {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.setFlyingBehavior(new FlyWithWings());
        duck.display();
        duck.swim();
        duck.fly();
        duck.quack();
    }
}
