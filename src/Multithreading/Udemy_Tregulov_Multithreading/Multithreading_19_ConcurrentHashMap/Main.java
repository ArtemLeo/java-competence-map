package Multithreading.Udemy_Tregulov_Multithreading.Multithreading_19_ConcurrentHashMap;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        // В ConcurrentHashMap ни KEY, ни VALUE не могут быть NULL;
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "Tom");
        map.put(2, "Zoe");
        map.put(3, "Den");
        map.put(4, "Anna");
        map.put(5, "John");
        System.out.println(map);

        Runnable runnable1 = () -> {
            Iterator<Integer> iterator = map.keySet().iterator();
            while (iterator.hasNext()) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                Integer i = iterator.next();
                System.out.println(i + " : " + map.get(i));
            }
        };

        Runnable runnable2 = () -> {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            map.put(6, "Elena");
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(map);
    }
}
