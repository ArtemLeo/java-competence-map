package Multithreading.Enlite_Multithreading.Multithreading_09_ThreadPool_Executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++) {
            executorService.execute(new MyThread("A"));
            executorService.execute(new MyThread("B"));
            executorService.execute(new MyThread("C"));
            executorService.execute(new MyThread("D"));
            executorService.execute(new MyThread("E"));
        }
        executorService.shutdown();
    }
}

class MyThread extends Thread {
    String name;

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + " -> " + name);
        }
    }
}
