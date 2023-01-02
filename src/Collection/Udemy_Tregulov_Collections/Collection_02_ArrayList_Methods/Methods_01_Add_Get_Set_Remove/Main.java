package Collection.Udemy_Tregulov_Collections.Collection_02_ArrayList_Methods.Methods_01_Add_Get_Set_Remove;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();

        // add();
        arrayList1.add("Tom");
        arrayList1.add("Anna");
        arrayList1.add("Den");

        // add() index - добавление через Index;
        arrayList1.add(1, "Max");
        System.out.println(arrayList1);
        System.out.println("-----------------------------");

        // All elements with forEach;
        for (String x : arrayList1) {
            System.out.print(x + " ");
        }
        System.out.println(" ");
        System.out.println("-----------------------------");

        // All elements with for loop;
        for (int i = 0; i < arrayList1.size(); i++) {
            System.out.print(arrayList1.get(i) + " ");
        }
        System.out.println(" ");
        System.out.println("-----------------------------");

        // get();
        System.out.println(arrayList1.get(2));
        System.out.println("-----------------------------");

        // set() (замена);
        arrayList1.set(2,"Anton");
        System.out.println(arrayList1);
        System.out.println("-----------------------------");

        // remove() (удаление);
        arrayList1.remove(2);
        System.out.println(arrayList1);
    }
}
