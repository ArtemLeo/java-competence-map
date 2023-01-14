package Multithreading.Udemy_Alishev_Multithreading.Multithreading_06_Methods_Wait_Notify;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WaitAndNotify waitAndNotify = new WaitAndNotify();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    waitAndNotify.produce();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    waitAndNotify.consume();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
}

class WaitAndNotify {
    public void produce() throws InterruptedException {
        synchronized (this) {
            System.out.println("Produce() -> Method wait() waits for permission to continue from the notify()");
            this.wait();
            System.out.println("Produce() -> continued to work!");
        }
    }

    public void consume() throws InterruptedException {
        Thread.sleep(2000);
        synchronized (this) {
            System.out.println("Consume() -> Method notify() awakening the thread Produce()");
            this.notify();
        }
    }
}
