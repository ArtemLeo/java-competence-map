package Multithreading.Udemy_Alishev_Multithreading.Multithreading_04_ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for (int i = 1; i <= 5; i++) {
            executorService.submit(new Work(i));
        }

        // No more tasks are expected - all tasks are in the works;
        executorService.shutdown();
        System.out.println("All tasks submitted!");
        System.out.println("--------------------");

        // Time limits on task completion (10 seconds);
        executorService.awaitTermination(10, TimeUnit.SECONDS);

    }
}

class Work implements Runnable {
    private final int id;

    public Work(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Work " + id + " was completed!");
    }
}
