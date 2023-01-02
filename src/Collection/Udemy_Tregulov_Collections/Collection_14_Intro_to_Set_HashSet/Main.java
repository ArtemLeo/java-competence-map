package Collection.Udemy_Tregulov_Collections.Collection_14_Intro_to_Set_HashSet;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Set - не поддерживает дубликаты, только уникальные значения;
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Tom");
        hashSet.add("Artem");
        hashSet.add("Anna");
        hashSet.add("Den");
        System.out.println(hashSet);
        System.out.println("----------------------");

        for (String s : hashSet){
            System.out.println(s);
        }
        System.out.println("----------------------");

        // remove();
        hashSet.remove("Den");
        System.out.println(hashSet);
        System.out.println("----------------------");

        // size();
        System.out.println(hashSet.size());
        System.out.println("----------------------");

        // isEmpty();
        System.out.println(hashSet.isEmpty());
        System.out.println("----------------------");

        // contains() - поиск элемент (true/false);
        System.out.println(hashSet.contains("Tom"));
        System.out.println("----------------------");

        HashSet<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(5);
        hashSet1.add(2);
        hashSet1.add(3);
        hashSet1.add(1);
        hashSet1.add(8);
        System.out.println(hashSet1);
        System.out.println("----------------------");

        HashSet<Integer> hashSet2 = new HashSet<>();
        hashSet2.add(7);
        hashSet2.add(4);
        hashSet2.add(3);
        hashSet2.add(5);
        hashSet2.add(8);
        System.out.println(hashSet2);
        System.out.println("----------------------");

        // addAll (union) - объединение 2-х множеств ;
        HashSet<Integer> union = new HashSet<>(hashSet1);
        union.addAll(hashSet2);
        System.out.println(union);
        System.out.println("----------------------");

        // retainAll (intersect) - нахождение/вывод на экран только элементов с дубликатами;
        HashSet<Integer> intersect = new HashSet<>(hashSet1);
        intersect.retainAll(hashSet2);
        System.out.println(intersect);
        System.out.println("----------------------");

        // removeAll (subtract) - удаление из hashSet1 всех элементов hashSet2 (останутся уникальные элементы hashSet1);
        HashSet<Integer> subtract = new HashSet<>(hashSet1);
        subtract.removeAll(hashSet2);
        System.out.println(subtract);
    }
}