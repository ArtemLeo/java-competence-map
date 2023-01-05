package Multithreading.Udemy_Tregulov_Multithreading.Multithreading_05_DataRace_SynchronizedMethods;

public class Main {
    volatile static int counter = 0;

    public static synchronized void increment() {
        counter++;
        System.out.print(counter + " ");
    }

    public static void main(String[] args) throws InterruptedException {
        MyRunnable runnable = new MyRunnable();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        System.out.println("Threads 1,2,3 are starting ...");
        Thread.sleep(2000);
        thread1.start();
        thread2.start();
        thread3.start();
        thread1.join();
        thread2.join();
        thread3.join();
        System.out.println(" ");
        System.out.println("Threads 1,2,3 are finished!");
        Thread.sleep(2000);
        System.out.println("---------------------------");

        Thread thread4 = new Thread(new MyRunnable1());
        Thread thread5 = new Thread(new MyRunnable1());
        System.out.println("Threads 4,5 are starting ...");
        Thread.sleep(2000);
        thread4.start();
        thread5.start();
        thread4.join();
        thread5.join();
        System.out.println(" ");
        System.out.println("Threads 4,5 are finished!");
        System.out.println("Counter = " + counter);
    }
}


class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            Main.increment();
        }
    }
}

class MyRunnable1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            Main.increment();
        }
    }
}
