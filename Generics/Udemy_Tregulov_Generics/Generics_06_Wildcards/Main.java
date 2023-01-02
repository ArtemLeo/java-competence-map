package Generics.Udemy_Tregulov_Generics.Generics_06_Wildcards;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // List<?> list = new ArrayList<>(); где <?> = Wildcard;

        // При использовании Wildcard, нельзя использовать методы, которые изменяют наш объект: list.add("Hello");

        // Использование границ для Wildcard: List<? extends Number> listName = new ArrayList<Integer>();

        // Использование границ до супер-класса для Number: List<? super Number> listName = new ArrayList<Object>();

        List<Double> list = new ArrayList<>();
        list.add(3.14);
        list.add(3.17);
        list.add(3.11);
        showListInfo(list);

        List<String> list1 = new ArrayList<>();
        list1.add("Anna");
        list1.add("Tom");
        list1.add("Den");
        showListInfo(list1);

        ArrayList<Double> list2 = new ArrayList<>();
        list2.add(3.14);
        list2.add(3.17);
        list2.add(3.11);
        System.out.println(sum(list2));

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(34);
        list3.add(32);
        list3.add(38);
        System.out.println(sum(list3));
    }

    static void showListInfo(List<?> list) {
        System.out.println("Мой лист содержит следующие элементы: " + list);
    }

    public static double sum(ArrayList<? extends Number> arrayList) {
        double sum = 0;
        for (Number x : arrayList) {
            sum += x.doubleValue();
        }
        return sum;
    }
}
