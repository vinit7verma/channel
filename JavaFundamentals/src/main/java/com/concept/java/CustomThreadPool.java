package com.concept.java;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CustomThreadPool {
    private ExecutorService executor;

    public CustomThreadPool(int threadCount) {
        executor = Executors.newFixedThreadPool(threadCount);
    }

    public void executeTask(Runnable task) {
        executor.execute(task);
    }

    public void shutdown() {
        executor.shutdown();
    }
}

class Main {
    public static void main(String[] args) {
        CustomThreadPool threadPool = new CustomThreadPool(5); // Create a thread pool with 5 threads
        // Submit tasks to the thread pool
        for (int i = 0; i < 10; i++) {
            int taskId = i;
            threadPool.executeTask(() -> {
                System.out.println("Task " + taskId + " is executing in thread " + Thread.currentThread().getName());
                // Perform your task logic here
            });
        }
        threadPool.shutdown(); // Shutdown the thread pool
    }
}
