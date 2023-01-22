package Multithreading.Udemy_Sumin_Multithreading.Multithreading_03_DaemonThreads_DataRace.DaemonThreads_02;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }

        for (int i = 0; i < 1000; i++) {
            counter.decrement();
        }

        System.out.println("Main counter = " + counter.getValue());
        System.out.println("------------------");

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    counter.increment();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    counter.decrement();
                }
            }
        });

        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Thread counter = " + counter.getValue());
    }
}

class Counter {
    private int value;

    public synchronized void increment() {
        value++;
    }

    public synchronized void decrement() {
        value--;
    }

    public int getValue() {
        return value;
    }
}