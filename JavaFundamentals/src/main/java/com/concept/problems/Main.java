package com.concept.problems;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {
    public static void main(String[] args) {
        BlockingQueue<Integer> bqueue = new ArrayBlockingQueue<Integer>(100);
        producer p1 = new producer(bqueue);
        consumer c1 = new consumer(bqueue);
        Thread pThread = new Thread(p1);
        Thread cThread = new Thread(c1);
        pThread.start();
        cThread.start();
    }
}

class producer implements Runnable {
    BlockingQueue<Integer> obj;

    public producer(BlockingQueue<Integer> obj) {
        this.obj = obj;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            try {
                obj.put(i);
                System.out.println("Produced " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class consumer implements Runnable {
    BlockingQueue<Integer> obj;
    int taken = -1;

    public consumer(BlockingQueue<Integer> obj) {
        this.obj = obj;
    }

    @Override
    public void run() {
        while (taken != 100) {
            try {
                taken = obj.take();
                System.out.println("Consumed " + taken);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
