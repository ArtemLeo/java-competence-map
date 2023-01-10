package Multithreading.Udemy_Tregulov_Multithreading.Multithreading_12_ThreadPool_ExecutorService.ThreadPool_ExecutorService_02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        // schedule() - pre-task time;
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
        for (int i = 0; i < 3; i++) {
            scheduledExecutorService.schedule(new MyRunnable200(), 2, TimeUnit.SECONDS);
        }
        scheduledExecutorService.shutdown();

        Thread.sleep(7000);
        System.out.println("------------------------------------");


        // scheduleAtFixedRate() - task time;
        ScheduledExecutorService scheduledExecutorService2 = Executors.newScheduledThreadPool(1);
        for (int i = 0; i < 3; i++) {
            scheduledExecutorService2.scheduleAtFixedRate(new MyRunnable200(), 3, 1, TimeUnit.SECONDS);
        }
        Thread.sleep(8000);
        scheduledExecutorService2.shutdown();

        Thread.sleep(2000);
        System.out.println("------------------------------------");


        // scheduleWithFixedDelay() - time period Between tasks;
        ScheduledExecutorService scheduledExecutorService3 = Executors.newScheduledThreadPool(1);
        for (int i = 0; i < 3; i++) {
            scheduledExecutorService3.scheduleWithFixedDelay(new MyRunnable200(), 3, 1, TimeUnit.SECONDS);
        }
        Thread.sleep(8000);
        scheduledExecutorService3.shutdown();

        Thread.sleep(2000);
        System.out.println("------------------------------------");


        // CachedThreadPool() - create threads if necessary;
        ExecutorService executorService = Executors.newCachedThreadPool();
    }
}

class MyRunnable200 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " begins work ...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + " ends work!");
    }
}
