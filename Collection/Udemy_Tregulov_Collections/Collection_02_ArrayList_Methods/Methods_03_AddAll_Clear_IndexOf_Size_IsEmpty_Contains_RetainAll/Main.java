package Collection.Udemy_Tregulov_Collections.Collection_02_ArrayList_Methods.Methods_03_AddAll_Clear_IndexOf_Size_IsEmpty_Contains_RetainAll;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Tom");
        arrayList1.add("Anna");
        arrayList1.add("Den");
        System.out.println(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("!!!");
        arrayList2.add("???");
        System.out.println(arrayList2);
        System.out.println("-----------------------------");

        // addAll();
        arrayList1.addAll(arrayList2);     // Добавление All в конец массива;
        arrayList1.addAll(1, arrayList2);     // Добавление по индексу;
        System.out.println(arrayList1);
        System.out.println("-----------------------------");

        // clear();
        arrayList1.clear();
        System.out.println(arrayList1);
        System.out.println("-----------------------------");

        // indexOf() принимает в параметры объект и возвращает его позицию. Если не найден, то возвращает -1;
        ArrayList<String> arrayList3 = new ArrayList<>();
        arrayList3.add("Tom");
        arrayList3.add("Anna");
        arrayList3.add("Den");
        int index = arrayList3.indexOf("Den");
        System.out.println(index);
        System.out.println("-----------------------------");

        // size() (сколько элементов в массиве);
        System.out.println(arrayList3.size());
        System.out.println("-----------------------------");

        // isEmpty() (содержит ли массив элементы);
        System.out.println(arrayList3.isEmpty());
        System.out.println("-----------------------------");

        // contains() (поиск элементов в массиве);
        System.out.println(arrayList3.contains("Anna"));
        System.out.println("-----------------------------");

        // removeAll() (Удалит все повторяющиеся элементы, в указанном массиве);
        arrayList1.removeAll(arrayList2);
        System.out.println(arrayList1);
        System.out.println("-----------------------------");

        // retainAll() (Оставит все повторяющиеся элементы, в указанном массиве);
        arrayList1.retainAll(arrayList2);
        System.out.println(arrayList1);
        System.out.println("-----------------------------");

        // containsAll() ("содержит все");
        boolean result = arrayList1.containsAll(arrayList2);
        System.out.println(result);
        System.out.println("-----------------------------");

        // subList() (фрагмент массива; с 1-го элемента по 2-й НЕ включительно);
        List<String> myList = arrayList2.subList(0, 2);
        System.out.println(myList);
        System.out.println("-----------------------------");

        // toArray();
        Object[] array = arrayList1.toArray();
        for (Object j : array) {
            System.out.print(j + " ");
        }

        // toArray(String[]);
        String[] array2 = arrayList1.toArray(new String[3]);
        for (String s : array2) {
            System.out.print(s + " ");
        }
        System.out.println(" ");
        System.out.println("-----------------------------");

        // List.of (List изменять НЕЛЬЗЯ);
        List<Integer> list1 = List.of(3, 8, 13);
        System.out.println(list1);
        System.out.println("-----------------------------");

        // List.copyOf (List изменять НЕЛЬЗЯ);
        List<String> list2 = List.copyOf(arrayList1);
        System.out.println(list2);
    }
}