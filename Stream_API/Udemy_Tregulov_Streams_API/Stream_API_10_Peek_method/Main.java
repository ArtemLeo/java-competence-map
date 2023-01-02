package Stream_API.Udemy_Tregulov_Streams_API.Stream_API_10_Peek_method;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        // Method Peek does the forEach method function, but Peek is intermediate;
        // Peek can be used in the middle of the stream;
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        System.out.println(stream.distinct().peek(System.out::println).count());
    }
}
