package Collection.Udemy_Tregulov_Collections.Collection_03_Interface_Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Tom");
        arrayList1.add("Anna");
        arrayList1.add("Den");

        // Iterator "перечислитель" (вывод на экран);
        Iterator<String> iterator = arrayList1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("-----------------------");

        // Iterator (удаление элемента);
        Iterator<String> iterator1 = arrayList1.iterator();
        while (iterator1.hasNext()) {
            iterator1.next();
            iterator1.remove();
        }
        System.out.println(arrayList1);
    }
}
