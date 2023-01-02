package Stream_API.Udemy_Tregulov_Streams_API.Stream_API_01_Intro_Stream_Map_method;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Bye");
        list.add("Yes");
        list.add("No");

        // Find the number of letters in each value;
        for (int i = 0; i < list.size(); i++) {
            list.set(i,String.valueOf(list.get(i).length()));
        }
        System.out.println(list);
        System.out.println("------------------------------");


        // Stream; Finding the length of each element;
        List<Integer> list2 = list.stream().map(element -> element.length()).collect(Collectors.toList());
        System.out.println(list2);
        System.out.println("------------------------------");

        // Stream; Array;
        int[] array = {5, 9, 3, 8, 1};
        array = Arrays.stream(array).map(element
                -> {
            if (element % 3 == 0) {
                element = element / 3;
            }
            return element;
        }).toArray();
        System.out.println(Arrays.toString(array));
        System.out.println("-------------------------------------");

        Set<String> set = new TreeSet<>();
        set.add("Hello");
        set.add("Bye");
        set.add("Yes");
        set.add("No");
        System.out.println(set);

        Set<Integer> set2 = set.stream().map(element->element.length()).collect(Collectors.toSet());
        System.out.println(set2);
        System.out.println("-------------------------------------");

        // or in List;
        List<Integer> list3 = set.stream().map(element->element.length()).collect(Collectors.toList());
        System.out.println(list3);

    }
}

