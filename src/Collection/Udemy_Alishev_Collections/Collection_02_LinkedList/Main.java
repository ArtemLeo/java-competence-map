package Collection.Udemy_Alishev_Collections.Collection_02_LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // LinkedList popular methods: add(), get(), size(), remove();
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(5);
        System.out.println(linkedList.get(0));
        System.out.println(linkedList.size());
        linkedList.remove(0);
        System.out.println("--------------------------");

        List<Integer> arrayList = new ArrayList<>();
        System.out.print("ArrayList = ");
        measureTime(arrayList);
        System.out.print("LinkedList = ");
        measureTime(linkedList);
        System.out.println("--------------------------");

        System.out.print("ArrayList = ");
        measureTime1(arrayList);
        System.out.print("LinkedList = ");
        measureTime1(linkedList);
        System.out.println("--------------------------");

        System.out.print("ArrayList = ");
        measureTime2(arrayList);
        System.out.print("LinkedList = ");
        measureTime2(linkedList);

        // + ArrayList: add() to end of list, get(), remove() 50/50;
        // + LinkedList: add() to start of list; remove() 50/50;
    }

    // Методы измеряют время работы операций на LinkedList и на ArrayList;
    // add(); To end of list;
    private static void measureTime(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            list.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    // get();
    private static void measureTime1(List<Integer> list1) {
        for (int i = 0; i < 100_000; i++) {
            list1.add(i);
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            list1.get(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    // add(); To start of list;
    private static void measureTime2(List<Integer> list2) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            list2.add(0, i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
