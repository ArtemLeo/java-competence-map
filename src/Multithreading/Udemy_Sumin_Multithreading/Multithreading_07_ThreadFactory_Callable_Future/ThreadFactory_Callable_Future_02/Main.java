package Multithreading.Udemy_Sumin_Multithreading.Multithreading_07_ThreadFactory_Callable_Future.ThreadFactory_Callable_Future_02;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3, new ThreadFactory() {
            // ThreadFactory();
            @Override
            public Thread newThread(Runnable r) {
                Thread thread = new Thread(r);
                thread.setDaemon(true);
                return thread;
            }
        });

        // "Timer" thread;
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.print(".");
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        // Thread of "Name";
        Future<String> futureName = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                return "John";
            }
        });

        // Thread of "Age";
        Future<Integer> futureAge = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                return 25;
            }
        });

        // Future get();
        try {
            String name = futureName.get();
            int age = futureAge.get();
            System.out.println("\nName: " + name);
            System.out.println("Age: " + age);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
