package Multithreading.Udemy_Tregulov_Multithreading.Multithreading_18_Synchronized_Collections.Synchronized_Collections_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i <= 15; i++) {
            arrayList.add(i);
        }
        List<Integer> synchList = Collections.synchronizedList(arrayList);
        Runnable runnable1 = () -> {
            // Для Iterator необходимо устанавливать lock вручную (synchronized block), иначе будет ConcurrentModificationException;
            synchronized (synchList) {
                Iterator<Integer> iterator = synchList.iterator();
                while (iterator.hasNext()) {
                    System.out.print(iterator.next() + " ");
                }
                System.out.println(" ");
            }
        };
        Runnable runnable2 = () ->
                synchList.remove(10);

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(synchList);
    }
}
