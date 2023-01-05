package Multithreading.Udemy_Tregulov_Multithreading.Multithreading_06_SynchronizedBlocks_Monitor.SynchronizedBlocks_02;

public class Main {
    static int counter = 0;

    public static void increment() {
        // Static methods use the "monitor" of the Main class;
        synchronized (Main.class) {
            counter++;
        }
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
