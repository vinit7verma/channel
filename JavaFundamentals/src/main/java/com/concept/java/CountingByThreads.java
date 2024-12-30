package com.concept.java;

import java.util.concurrent.atomic.AtomicInteger;

public class CountingByThreads {
    public static void main(String[] args) throws InterruptedException {
        AtomicInteger counter = new AtomicInteger(1);
        Thread t1 = new Thread(new CountTask(counter));
        Thread t2 = new Thread(new CountTask(counter));
        Thread t3 = new Thread(new CountTask(counter));
        t1.start();
        t2.start();
        t3.start();
    }
}

class CountTask implements Runnable {
    private AtomicInteger counter;

    CountTask(AtomicInteger counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        synchronized (counter) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(Thread.currentThread().getName());
                System.out.println(counter.getAndIncrement());
            }
        }
    }
}
