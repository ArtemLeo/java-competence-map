package Collection.Udemy_Tregulov_Collections.Collection_01_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Tom");
        arrayList1.add("Anna");
        arrayList1.add("Den");
        System.out.println(arrayList1);
        System.out.println("-------------------------------");

        ArrayList<String> arrayList2 = new ArrayList<>(200); // Capacity - вместимость ArrayList;
        arrayList2.add("Tom");
        arrayList2.add("Anna");
        System.out.println(arrayList2.size()); // Size - текущий размер ArrayList;
        System.out.println("-------------------------------");

        List<String> arrayList3 = new ArrayList<>(); // Создание по иерархии - от List;

        // В качестве параметров принимается другой ArrayList. Создаётся новый ArrayList;
        List<String> arrayList4 = new ArrayList<>(arrayList1);
        System.out.println(arrayList4);
        System.out.println("-------------------------------");
        System.out.println(arrayList1 == arrayList4);
    }
}

