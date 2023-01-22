package Multithreading.Udemy_Sumin_Multithreading.Multithreading_12_Semapfore_CyclicBarrier.Semapfore_CyclicBarrier_02;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class Main {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(2);
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    long millis = (long) (Math.random() * 5000 + 1000);
                    String name = Thread.currentThread().getName();
                    System.out.println(name + ": Data is being prepared ...");
                    try {
                        Thread.sleep(millis);
                        System.out.println(name + ": Data is ready!");
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    try {
                        cyclicBarrier.await();
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(name + ": Continue work ...");
                }
            }).start();
        }
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
