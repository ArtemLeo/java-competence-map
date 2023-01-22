package Multithreading.Udemy_Sumin_Multithreading.Multithreading_08_LinkedBlockingQueue.LinkedBlockingQueue_01;

import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        LinkedBlockingQueue<Runnable> blockingQueue = new LinkedBlockingQueue<>();
        new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (true) {
                    System.out.println("Counter: " + i);
                    i++;
                    Runnable task = null;
                    try {
                        task = blockingQueue.take();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    new Thread(task).start();
                }
            }
        }).start();

        for (int i = 0; i < 10; i++) {
            final int index = i;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            blockingQueue.add(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("--- " + index);
                }
            });
        }
    }
}
