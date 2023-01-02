package Stream_API.Udemy_Tregulov_Streams_API.Stream_API_08_Distinct_method;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        // Distinct method - output UNIQUE elements;
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        stream.distinct().forEach(System.out::println);
    }
}
