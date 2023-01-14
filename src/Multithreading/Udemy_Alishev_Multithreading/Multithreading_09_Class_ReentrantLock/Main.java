package Multithreading.Udemy_Alishev_Multithreading.Multithreading_09_Class_ReentrantLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Task task = new Task();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                task.firstThread();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                task.firstThread();
            }
        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        task.showCounter();
    }
}

class Task {
    private int counter;

    private Lock reentrantLock = new ReentrantLock();

    private void increment() {
        for (int i = 0; i < 10000; i++) {
            counter++;
        }
    }

    public void firstThread() {
        reentrantLock.lock();
        increment();
        reentrantLock.unlock();
    }

    public void secondThread() {
        reentrantLock.lock();
        increment();
        reentrantLock.unlock();
    }

    public void showCounter() {
        System.out.println("Counter = " + counter);
    }
}
