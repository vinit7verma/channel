package com.concept.service.patterns;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class StrategyTest {
    public static void main(String[] args) {
        Emp e1 = new Emp();
        Emp e2 = new Emp();
        Set<Emp> sortSet = new TreeSet<>();
        sortSet.add(e1);
        sortSet.add(e2);
        System.out.println(sortSet);
        Objects.hash(e1, e2);
    }

}

class Calculator {
    private Strategy strategy;

    Calculator(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int a, int b) {
        return strategy.doOperation(a, b);
    }
}

interface Strategy {
    int doOperation(int a, int b);
}

final class SumOperation implements Strategy {
    @Override
    public int doOperation(int a, int b) {
        return a + b;
    }
}

class Emp implements Comparable<Emp> {
    int a;
    String name;

    @Override
    public int compareTo(Emp o) {
        return 0;
    }
}
