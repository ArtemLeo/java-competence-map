package Multithreading.Udemy_Tregulov_Multithreading.Multithreading_18_Synchronized_Collections;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        // First ArrayList;
        ArrayList<Integer> source = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            source.add(i);
        }

        // Second ArrayList;
        ArrayList<Integer> target = new ArrayList<>();

        // Runnable + Threads;
        Runnable runnable = () -> {
            target.addAll(source);
        };
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(target);
    }
}
