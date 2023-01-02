package Stream_API.Udemy_Tregulov_Streams_API.Stream_API_04_Reduce_method;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(3);

        // Option 1;
        int result = list.stream().reduce((accumulator, element) ->
                accumulator * element).get();
        System.out.println(result);
        System.out.println("------------------------");

        // 5, 8, 2, 4, 3
        // accumulator = 5 40 80 320 960
        // element     = 8  2  4  3


        // Option 2;
        int result2 = list.stream().reduce(1, (accumulator, element) ->
                accumulator * element);
        System.out.println(result2);
        System.out.println("------------------------");

        // 5, 8, 2, 4, 3
        // accumulator = 1 5 40 80 320 960
        // element     = 5 8  2  4  3


        // reduce (string concatenation);
        List<String> list3 = new ArrayList<>();
        list3.add("Hello");
        list3.add("Bye");
        list3.add("Yes");
        list3.add("No");
        String result3 = list3.stream().reduce((accumulator, element) ->
                accumulator + ", " + element).get();
        System.out.println(result3);
        System.out.println("------------------------");


        // Class Optional and method "isPresent";
        List<Integer> list100 = new ArrayList<>();

        // Optional (checking for the presence of elements in a list)
        Optional<Integer> optional = list100.stream().reduce((accumulator, element) ->
                accumulator * element);
        if (optional.isPresent()) {
            System.out.println(optional.get());
        } else {
            System.out.println("Not present");
        }
    }
}
