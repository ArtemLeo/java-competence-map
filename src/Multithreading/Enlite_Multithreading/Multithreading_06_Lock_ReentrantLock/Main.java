package Multithreading.Enlite_Multithreading.Multithreading_06_Lock_ReentrantLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        MyThread thread = new MyThread();
        Thread thread1 = new Thread(thread);
        Thread thread2 = new Thread(thread);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("x = " + thread.getX());

    }
}

class MyThread extends Thread {
    Lock lock = new ReentrantLock();
    int x = 0;

    @Override
    public void run() {
        lock.lock();
        for (int i = 0; i < 10000; i++) {
            x++;
        }
        lock.unlock();
    }

    public int getX() {
        return x;
    }
}
