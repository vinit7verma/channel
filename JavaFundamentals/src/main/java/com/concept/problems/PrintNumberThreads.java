package com.concept.problems;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrintNumberThreads extends Throwable {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        final AtomicInteger atomicInteger = new AtomicInteger(1);
        final CyclicBarrier cyclicBarrier = new CyclicBarrier(10, () -> {
            System.out.println("a cycle done");
        });

        IntStream.rangeClosed(0, 9)
                .boxed()
                .map(i -> new PrintSequenceTask(i, atomicInteger, cyclicBarrier))
                .map(p -> executorService.submit(p))
                .collect(Collectors.toList());

        executorService.shutdown();

    }
}

class PrintSequenceTask implements Runnable {
    private final int index;
    private final AtomicInteger atomicInteger;
    private final CyclicBarrier cyclicBarrier;

    PrintSequenceTask(int index, AtomicInteger atomicInteger, CyclicBarrier cyclicBarrier) {
        this.index = index;
        this.atomicInteger = atomicInteger;
        this.cyclicBarrier = cyclicBarrier;
    }

    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            while (((atomicInteger.get() - index - 1) % 10 != 0)) {
            }
            System.out.println(Thread.currentThread().getName() + " " + (atomicInteger.get()));
            atomicInteger.getAndIncrement();
            await();
        }
    }

    public void await() {
        try {
            cyclicBarrier.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}

class MyRunnable implements Runnable {

    private static final int LIMIT = 20;
    private static volatile int counter = 0;
    private int id;

    public MyRunnable(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        outer:
        while (counter < LIMIT) {
            while (counter % 10 != id) {
                if (counter == LIMIT) break outer;
            }
            System.out.println("Thread " + Thread.currentThread().getName() + " printed " + counter);
            counter += 1;
        }
    }
}

class PrintTask extends RecursiveAction {
    private static final int THRESHOLD = 10;
    private int start;
    private int end;

    public PrintTask(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected void compute() {
        if (end - start <= THRESHOLD) {
            for (int i = start; i <= end; i++) {
                System.out.println(i);
            }
        } else {
            int middle = start + (end - start) / 2;
            PrintTask leftSubtask = new PrintTask(start, middle);
            PrintTask rightSubtask = new PrintTask(middle + 1, end);

            leftSubtask.fork();
            rightSubtask.compute();
            leftSubtask.join();
        }
    }

    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        PrintTask printTask = new PrintTask(1, 100);
        forkJoinPool.invoke(printTask);
    }
}