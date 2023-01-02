package Generics.Udemy_Tregulov_Generics.Generics_01_Intro;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Bye");
        list.add("Hi");
        System.out.println(list);

        for (String x : list) {
            System.out.println(x);
        }

         /*
         Generics позволяют:
         - Type Safe: создавать коллекции определённых типов;
         - Reusable Code: не создавать дубликат кода;
         */

    }
}
