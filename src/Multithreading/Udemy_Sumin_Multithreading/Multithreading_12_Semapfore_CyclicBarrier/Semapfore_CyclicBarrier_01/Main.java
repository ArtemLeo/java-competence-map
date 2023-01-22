package Multithreading.Udemy_Sumin_Multithreading.Multithreading_12_Semapfore_CyclicBarrier.Semapfore_CyclicBarrier_01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Semaphore semaphore = new Semaphore(3);
        for (int i = 0; i < 10; i++) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    String name = Thread.currentThread().getName();
                    System.out.println(name + " STARTED ...");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    try {
                        semaphore.acquire();
                        workWithFileSystem();
                        semaphore.release();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    } finally {
                        semaphore.release();
                    }
                    System.out.println(name + " FINISHED!");
                }
            });
        }
        executorService.shutdown();
    }

    private static void workWithFileSystem() {
        String nameImMethod = Thread.currentThread().getName();
        System.out.println(nameImMethod + " STARTED working with file system!");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(nameImMethod + " FINISHED working with file system!");
    }
}
