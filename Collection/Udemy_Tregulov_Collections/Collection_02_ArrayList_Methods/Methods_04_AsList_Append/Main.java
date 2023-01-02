package Collection.Udemy_Tregulov_Collections.Collection_02_ArrayList_Methods.Methods_04_AsList_Append;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        StringBuilder sb4 = new StringBuilder("D");

        // asList() (получаем ArrayList из массива, которые будут связаны);
        StringBuilder[] array = {sb1, sb2, sb3, sb4};
        List <StringBuilder> list = Arrays.asList(array);
        System.out.println(list);
        System.out.println("-----------------------");

        // append() (добавление к элементу, по индексу);
        array[0].append(" !!!");
        array[2].append(" ???");
        System.out.println(list);
    }
}
