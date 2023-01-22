package Multithreading.Udemy_Sumin_Multithreading.Multithreading_02_InterruptingThreads_SystemCurrentTimeMillis.Interrupting_Threads_03;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<String> list;

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                list = new ArrayList<>();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                long before = System.currentTimeMillis();

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                try {
                    thread1.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Size of list = " + list.size());

                long after = System.currentTimeMillis();
                System.out.println("CurrentTimeMillis = " + (after - before));
            }
        });

        thread1.start();
        thread2.start();
    }
}
