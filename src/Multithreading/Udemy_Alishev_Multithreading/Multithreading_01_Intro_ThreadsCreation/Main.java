package Multithreading.Udemy_Alishev_Multithreading.Multithreading_01_Intro_ThreadsCreation;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Creating a thread with "extends Thread";
        MyThread myThread1 = new MyThread();
        myThread1.start();

        MyThread myThread2 = new MyThread();
        myThread2.start();
        myThread2.join();

        System.out.println("Hello from Main thread!");
        System.out.println("------------------------");

        // Method sleep();
        System.out.println("I`m going to sleep ...");
        Thread.sleep(3000);
        System.out.println("I'm awake!");
        System.out.println("------------------------");

        // Creating a thread with "implements Runnable";
        Thread myThread3 = new Thread(new Runner());
        myThread3.start();

    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread() + "Hello from MyThread! - " + i);
        }
    }
}

class Runner implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread() + "Hello from MyThread! - " + i);
        }
    }
}
