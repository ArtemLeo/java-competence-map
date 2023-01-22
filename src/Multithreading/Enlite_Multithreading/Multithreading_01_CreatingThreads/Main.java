package Multithreading.Enlite_Multithreading.Multithreading_01_CreatingThreads;

import javax.swing.plaf.TableHeaderUI;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello from MainThread! -> " + Thread.currentThread().getName());

        // MyThread;
        MyThread myThread = new MyThread();
        myThread.start();

        // MyRunnable;
        Thread myRunnable = new Thread(new MyRunnable());
        myRunnable.start();

    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Hello from MyThread! -> " + Thread.currentThread().getName());
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello from MyRunnable! -> " + Thread.currentThread().getName());
    }
}
