package Collection.Udemy_Tregulov_Collections.Collection_06_ClassCollections_Method_BinarySearch;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(-3);
        arrayList.add(8);
        arrayList.add(12);
        arrayList.add(-8);
        arrayList.add(0);
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(1);
        arrayList.add(150);
        arrayList.add(-30);
        System.out.println(arrayList);
        System.out.println("-----------------------------");

        Collections.sort(arrayList);
        System.out.println(arrayList);
        System.out.println("-----------------------------");

        // Поиск элемента через Collections.binarySearch;
        int index = Collections.binarySearch(arrayList, 12);
        System.out.println(index);
        // Если число в массиве не найдено, то выведется отрицательное число (например "-9");
        System.out.println("-----------------------------");

        // Метод reverse;
        Collections.reverse(arrayList);
        System.out.println(arrayList);
        System.out.println("-----------------------------");

        // Перемешивание (shuffle);
        Collections.shuffle(arrayList);
        System.out.println(arrayList);
    }
}
