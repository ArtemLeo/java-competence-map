package Multithreading.Udemy_Tregulov_Multithreading.Multithreading_18_Synchronized_Collections.Synchronized_Collections_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        // First ArrayList;
        ArrayList<Integer> source = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            source.add(i);
        }

        // Second ArrayList;
        List<Integer> synchList = Collections.synchronizedList(new ArrayList<>());

        // Runnable + Threads;
        Runnable runnable = () -> {
            synchList.addAll(source);
        };
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(synchList);
    }
}
