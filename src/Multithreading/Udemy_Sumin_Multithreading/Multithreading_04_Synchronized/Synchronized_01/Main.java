package Multithreading.Udemy_Sumin_Multithreading.Multithreading_04_Synchronized.Synchronized_01;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        int barrier = 10_000_000;

        long before = System.currentTimeMillis();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < barrier; i++) {
                    counter.increment1();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < barrier; i++) {
                    counter.decrement1();
                }
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < barrier; i++) {
                    counter.increment2();
                }
            }
        });

        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < barrier; i++) {
                    counter.decrement2();
                }
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Counter get.Value1() = " + counter.getValue1());
        System.out.println("Counter get.Value2() = " + counter.getValue2());
        long after = System.currentTimeMillis();
        System.out.println("CurrentTimeMillis = " + (after - before));
    }
}

class Counter {
    private int value1;
    private int value2;

    private final Object monitor1 = new Object();
    private final Object monitor2 = new Object();

    public void increment1() {
        synchronized (monitor1) {
            value1++;
        }
    }

    public void decrement1() {
        synchronized (monitor1) {
            value1--;
        }
    }

    public void increment2() {
        synchronized (monitor2) {
            value2++;
        }
    }

    public void decrement2() {
        synchronized (monitor2) {
            value2--;
        }
    }

    public int getValue1() {
        return value1;
    }

    public int getValue2() {
        return value2;
    }
}
