package Multithreading.Enlite_Multithreading.Multithreading_10_Semaphore;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);

        CheckSemaphore semaphore1 = new CheckSemaphore(semaphore);
        CheckSemaphore semaphore2 = new CheckSemaphore(semaphore);
        CheckSemaphore semaphore3 = new CheckSemaphore(semaphore);
        CheckSemaphore semaphore4 = new CheckSemaphore(semaphore);
        CheckSemaphore semaphore5 = new CheckSemaphore(semaphore);

        Thread thread1 = new Thread(semaphore1);
        Thread thread2 = new Thread(semaphore2);
        Thread thread3 = new Thread(semaphore3);
        Thread thread4 = new Thread(semaphore4);
        Thread thread5 = new Thread(semaphore5);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

    }

    static class CheckSemaphore extends Thread {
        Semaphore semaphore;

        public CheckSemaphore(Semaphore semaphore) {
            this.semaphore = semaphore;
        }

        @Override
        public void run() {
            try {
                semaphore.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " = " + i);
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            semaphore.release();
        }
    }
}
