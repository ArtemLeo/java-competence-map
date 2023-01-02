package Collection.Udemy_Tregulov_Collections.Collection_09_Intro_to_Map_HashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();

        // put - добавление элементов в Map;
        map1.put(22455, "Tom");
        map1.put(98374564, "Anna");
        map1.put(5395, "Den");
        map1.put(948556, "Den");
        map1.put(null, "Zack");
        map1.put(9483722, null);
        System.out.println(map1);
        System.out.println("----------------------------");

        // putIfAbsent - добавить элемент, если такой отсутствует (проверка по ключу);
        map1.putIfAbsent(53952, "Anna");
        System.out.println(map1);
        System.out.println("----------------------------");

        // get - находит/выводит на экран элемент по ключу (null - если элемент отсутствует);
        System.out.println(map1.get(5395));
        System.out.println("----------------------------");

        // remove - удаление элемента по ключу;
        map1.remove(948556);
        System.out.println(map1);
        System.out.println("----------------------------");

        // containsValue - проверка на наличие элемента по значению;
        System.out.println(map1.containsValue("Den"));
        System.out.println("----------------------------");

        // containsKey - проверка на наличие элемента по ключу;
        System.out.println(map1.containsKey(837463));
        System.out.println("----------------------------");

        // keySet - находит/выводит на экран все ключи;
        System.out.println(map1.keySet());
        System.out.println("----------------------------");

        // values - находит/выводит на экран все значения;
        System.out.println(map1.values());
        System.out.println("----------------------------");

        Map<String, String> map2 = new HashMap<>();
        map2.put("Tom", "Funny");
        map2.put("Anna", "Strong");
        System.out.println(map2);
    }
}
