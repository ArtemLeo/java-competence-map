package Stream_API.Udemy_Tregulov_Streams_API.Stream_API_06_Chaining_method;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {

        // Without "Terminal" method, the "Intermediate" method will NOT work;
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        List<Integer> list = stream1.filter(el -> {
            System.out.println("!!!!");
            return el % 2 == 0;
        }).collect(Collectors.toList());
        System.out.println(list);
    }
}

