package Collection.Udemy_Alishev_Collections.Collection_01_Intro_to_Collection_ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // add();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);
        System.out.println("----------------------------");

        // get();
        System.out.println(list.get(0));
        System.out.println(list.get(9));
        System.out.println("----------------------------");

        // size();
        System.out.println(list.size());
        System.out.println("----------------------------");

        // For loop; Вывод на экран всех элементов ArrayList;
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("----------------------------");

        // ForEach; Вывод на экран всех элементов ArrayList;
        for (Integer i : list) {
            System.out.println(i);
        }
        System.out.println("----------------------------");

        // remove();
        System.out.println(list.remove(5));
        System.out.println(list);
        System.out.println("----------------------------");

        // Преобразование в LinkedList;
        list = new LinkedList<>(list);
        System.out.println(list);
    }
}
