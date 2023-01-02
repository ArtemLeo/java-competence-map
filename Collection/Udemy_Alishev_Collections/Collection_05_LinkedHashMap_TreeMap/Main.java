package Collection.Udemy_Alishev_Collections.Collection_05_LinkedHashMap_TreeMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String, String> translations = new HashMap<>();
        translations.put("Кошка", "Cat");
        translations.put("Собака", "Dog");
        translations.put("Слон", "Elephant");
        System.out.println(translations);
        System.out.println("-------------------------");

        for (Map.Entry<String, String> entry : translations.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("-------------------------");

        // HashMap НЕ запоминает порядок добавления элементов <K, V>;
        Map<Integer, String> hashMap = new HashMap<>();

        // LinkedHashMap запоминает порядок добавления элементов <K, V>;
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

        // TreeMap гарантирует сортировку элементов <K, V> по ключу;
        Map<Integer, String> treeMap = new TreeMap<>();

        System.out.println("HashMap ->");
        testMap(hashMap);
        System.out.println("-------------------------");
        System.out.println("LinkedHashMap ->");
        testMap(linkedHashMap);
        System.out.println("-------------------------");
        System.out.println("TreeMap ->");
        testMap(treeMap);
        System.out.println("-------------------------");
    }

    public static void testMap(Map<Integer, String> map) {
        map.put(39, "Bob");
        map.put(12, "Mike");
        map.put(78, "Tom");
        map.put(0, "Anna");
        map.put(1500, "Zoe");
        map.put(7, "Bob");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
