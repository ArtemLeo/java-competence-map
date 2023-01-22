package Multithreading.Enlite_Multithreading.Multithreading_03_Methods_Sleep_Join_Yield;

public class Main {
    public static void main(String[] args) {

        System.out.println("MainThread started ...");
        System.out.println("----------------------");

        MyThread myThread = new MyThread();
        myThread.start();

        // join();
        try {
            myThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // sleep();
        try {
            Thread.sleep(1000);
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
            // yield();
            Thread.yield();
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
