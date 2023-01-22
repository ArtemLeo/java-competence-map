package Multithreading.Enlite_Multithreading.Multithreading_02_Thread_statuses;

import java.net.Socket;

public class Main {
    public static void main(String[] args) {
        // 5 statuses of Thread: New -> Ready -> Running -> Blocked -> Dead;

        System.out.println("MainThread started ...");
        System.out.println("----------------------");

        MyThread myThread = new MyThread();
        myThread.start();
        try {
            myThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Thread myRunnable = new Thread(new MyRunnable());
        myRunnable.start();
        try {
            myRunnable.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("MainThread finished!");
        System.out.println("----------------------");
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread started ...");
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i + " " + Thread.currentThread().getName());
        }
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("MyRunnable started ...");
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i + " " + Thread.currentThread().getName());
        }
    }
}
