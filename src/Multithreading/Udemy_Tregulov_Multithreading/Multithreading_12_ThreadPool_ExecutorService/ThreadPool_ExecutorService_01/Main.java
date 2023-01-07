package Multithreading.Udemy_Tregulov_Multithreading.Multithreading_12_ThreadPool_ExecutorService.ThreadPool_ExecutorService_01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Thread Main starts ...");
        System.out.println("-----------------------");

        // newFixedThreadPool();
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            executorService.execute(new MyRunnable100());
        }
        executorService.shutdown();
        executorService.awaitTermination(5, TimeUnit.SECONDS);

        System.out.println("-----------------------");
        System.out.println("Thread Main ends!");
        System.out.println(" ");


        // newSingleThreadExecutor();
        ExecutorService executorService1 = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            executorService1.execute(new MyRunnable100());
        }
        executorService1.shutdown();
    }
}

class MyRunnable100 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " begins work ...");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + " ends work!");
    }
}
