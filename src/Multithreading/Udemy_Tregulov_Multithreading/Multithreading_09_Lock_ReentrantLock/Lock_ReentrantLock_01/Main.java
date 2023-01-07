package Multithreading.Udemy_Tregulov_Multithreading.Multithreading_09_Lock_ReentrantLock.Lock_ReentrantLock_01;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        Call call = new Call();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                call.mobileCall();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                call.skypeCall();
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                call.whatAppCall();
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Call {
    private final Lock lock = new ReentrantLock();

    void mobileCall() {
        lock.lock();
        try {
            System.out.println("Mobile call starts ...");
            Thread.sleep(3000);
            System.out.println("Mobile call ends!");
            System.out.println("------------------");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }

    void skypeCall() {
        lock.lock();
        try {
            System.out.println("Skype call starts ...");
            Thread.sleep(5000);
            System.out.println("Skype call ends!");
            System.out.println("------------------");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }

    void whatAppCall() {
        lock.lock();
        try {
            System.out.println("WhatApp call starts ...");
            Thread.sleep(7000);
            System.out.println("WhatApp call ends!");
            System.out.println("------------------");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }
}
