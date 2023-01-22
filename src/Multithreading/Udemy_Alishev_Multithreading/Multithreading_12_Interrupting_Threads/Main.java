package Multithreading.Udemy_Alishev_Multithreading.Multithreading_12_Interrupting_Threads;

import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Random random = new Random();
                for (int i = 0; i < 1_000_000_000; i++) {
                    if (Thread.currentThread().isInterrupted()) {
                        System.out.println("Thread was interrupted!");
                        break;
                    }
                    Math.sin(random.nextInt());
                }
            }
        });
        System.out.println("Thread starting ...");
        thread.start();

        // interrupt() called before join();
        Thread.sleep(3000);
        thread.interrupt();

        thread.join();


        System.out.println("Thread has finished!");
    }
}
