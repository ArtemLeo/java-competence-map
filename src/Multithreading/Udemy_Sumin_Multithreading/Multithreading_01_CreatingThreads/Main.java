package Multithreading.Udemy_Sumin_Multithreading.Multithreading_01_CreatingThreads;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start ...");

        Thread myThread = new MyThread();
        Thread myRunnable = new Thread(new MyRunnable());
        Thread myAnonymousRun = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 21; i <= 30; i++) {
                    System.out.print(i + " ");
                }
            }
        });

        myThread.start();
        myRunnable.start();
        myAnonymousRun.start();
        myThread.join();
        myRunnable.join();
        myAnonymousRun.join();

        System.out.println("\nFinish!");
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 11; i <= 20; i++) {
            System.out.print(i + " ");
        }
    }
}