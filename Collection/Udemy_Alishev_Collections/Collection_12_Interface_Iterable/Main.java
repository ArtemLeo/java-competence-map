package Collection.Udemy_Alishev_Collections.Collection_12_Interface_Iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Iterable let us walk all the elements of a collection;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // ForEach only runs on the elements of the collection;
        // Iterator can walk and remove elements of a collection;

        // Now Iterator is used inside forEach ... ;
        for (Integer x : list) {
            System.out.println(x);
        }
        System.out.println("----------------------------");

        // ... before Java 5;
        Iterator<Integer> iterator = list.iterator();
        int index = 0;
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            if (index == 1) {
                iterator.remove();
            }
            index++;
        }
        System.out.println(list);
    }
}
