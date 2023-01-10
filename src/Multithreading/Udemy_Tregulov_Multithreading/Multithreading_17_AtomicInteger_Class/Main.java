package Multithreading.Udemy_Tregulov_Multithreading.Multithreading_17_AtomicInteger_Class;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    // AtomicInteger - class uses atomic operations;
    // Atomic operation - это операция, которую безопасно выполнять при параллельных вычислениях в нескольких потоках,
    // не используя при этом ни блокировок, ни synchronized.

    // -------------- Methods --------------
    // incrementAndGet(), getAndIncrement();
    //       addAndGet(), getAndAdd();
    // decrementAndGet(), getAndDecrement();

    static AtomicInteger counter = new AtomicInteger(0);

    public static void increment() {
        counter.incrementAndGet();
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRunnable());
        Thread thread2 = new Thread(new MyRunnable());
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(counter);
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            Main.increment();
        }
    }
}
