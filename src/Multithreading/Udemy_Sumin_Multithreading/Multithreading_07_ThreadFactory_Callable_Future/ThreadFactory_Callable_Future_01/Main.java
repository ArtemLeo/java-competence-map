package Multithreading.Udemy_Sumin_Multithreading.Multithreading_07_ThreadFactory_Callable_Future.ThreadFactory_Callable_Future_01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor(new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                Thread thread = new Thread(r);
                thread.setDaemon(true);
                return thread;
            }
        });
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                int seconds = 0;
                while (true) {
                    System.out.println("Seconds = " + seconds);
                    try {
                        Thread.sleep(1000);
                        seconds++;
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        // Main Thread;
        for (int i = 0; i < 10; i++) {
            System.out.println("...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("------------");
        System.out.println("Finish!");
    }
}
