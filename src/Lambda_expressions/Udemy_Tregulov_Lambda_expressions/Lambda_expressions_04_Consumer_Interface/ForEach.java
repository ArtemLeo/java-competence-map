package Lambda_expressions.Udemy_Tregulov_Lambda_expressions.Lambda_expressions_04_Consumer_Interface;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> list = List.of("Hello!", "How are you?", "Bye!");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("----------------------------------");

        list.forEach(s -> System.out.println(s));
        System.out.println("----------------------------------");

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.forEach(element -> {
            System.out.println(element);
            element *= 2;
            System.out.println(element);
        });
    }
}
