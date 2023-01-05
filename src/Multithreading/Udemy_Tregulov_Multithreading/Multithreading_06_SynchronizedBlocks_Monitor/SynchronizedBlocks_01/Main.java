package Multithreading.Udemy_Tregulov_Multithreading.Multithreading_06_SynchronizedBlocks_Monitor.SynchronizedBlocks_01;

public class Main {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Counter {
    volatile static int count = 0;
}

class MyRunnable implements Runnable {
    private void doWork1() {
        // doWork() method is`t synchronized;
        doWork2();
        // In the block below, the doWork1 method is synchronized;
        synchronized (this) {
            Counter.count++;
            System.out.print(Counter.count + " ");
        }
    }

    private void doWork2() {
        System.out.print("Yahoo ");
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            doWork1();
        }
    }
}
