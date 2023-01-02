package Collection.Udemy_Alishev_Collections.Collection_04_HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.SocketHandler;

public class Main {
    public static void main(String[] args) {
        // HashMap does not remember the location of elements;
        // put();
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        System.out.println(map);
        System.out.println("--------------------------");

        map.put(3, "New Three");
        System.out.println(map);
        System.out.println("--------------------------");

        // get();
        System.out.println(map.get(1));
        System.out.println(map.get(10));
        System.out.println("--------------------------");

        // forEach;
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
