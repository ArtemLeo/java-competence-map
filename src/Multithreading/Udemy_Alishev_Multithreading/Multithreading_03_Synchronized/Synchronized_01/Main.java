package Multithreading.Udemy_Alishev_Multithreading.Multithreading_03_Synchronized.Synchronized_01;

public class Main {
    private static int counter;

    public synchronized void increment() {
        counter++;
    }

    public static void main(String[] args) throws InterruptedException {
        // The default synchronization (this) is on the object of the class Main;
        Main main = new Main();
        main.doWork();

        System.out.println("--------------------------");
        System.out.println("Counter = " + counter);
    }

    public void doWork() throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    increment();
                    System.out.println("Counter of thread1 = " + counter);
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    increment();
                    System.out.println("Counter of thread2 = " + counter);
                }
            }
        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
}
