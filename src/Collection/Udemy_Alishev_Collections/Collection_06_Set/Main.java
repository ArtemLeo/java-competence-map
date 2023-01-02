package Collection.Udemy_Alishev_Collections.Collection_06_Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // Set хранит только уникальные элементы;
        // HashSet НЕ запоминает порядок добавления элементов;
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Mike");
        hashSet.add("Katy");
        hashSet.add("Tom");
        // hashSet.add("Tom");
        hashSet.add("George");
        hashSet.add("Donald");

        System.out.println("HashSet ->");
        for (String s : hashSet) {
            System.out.println(s);
        }
        System.out.println("--------------------------------");

        // LinkedHashSet запоминает порядок добавления элементов;
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Mike");
        linkedHashSet.add("Katy");
        linkedHashSet.add("Tom");
        // linkedHashSet.add("Tom");
        linkedHashSet.add("George");
        linkedHashSet.add("Donald");

        System.out.println("LinkedHashSet ->");
        for (String s : linkedHashSet) {
            System.out.println(s);
        }
        System.out.println("--------------------------------");

        // TreeSet гарантирует сортировку элементов;
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Mike");
        treeSet.add("Katy");
        treeSet.add("Tom");
        // treeSet.add("Tom");
        treeSet.add("George");
        treeSet.add("Donald");

        System.out.println("TreeSet ->");
        for (String s : treeSet) {
            System.out.println(s);
        }
        System.out.println("--------------------------------");

        // contains();
        System.out.println(hashSet.contains("Mike"));
        System.out.println(hashSet.contains("Tim"));
        System.out.println("--------------------------------");

        // isEmpty();
        System.out.println(hashSet.isEmpty());
        System.out.println("--------------------------------");

        Set<Integer> set1 = new HashSet<>();
        set1.add(0);
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);

        // addAll(); Union - объединение множеств;
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println(union);
        System.out.println("--------------------------------");

        // retainAll(); Intersection - пересечение множеств;
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println(intersection);
        System.out.println("--------------------------------");

        // removeAll(); Difference - разность множеств;
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println(difference);
        System.out.println("--------------------------------");
    }
}
