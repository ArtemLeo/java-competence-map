package Stream_API.Udemy_Tregulov_Streams_API.Stream_API_09_Count_method;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        // Count method - calculates the number of elements in the stream;
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        System.out.println("Count of elements = " + stream.count());
        System.out.println("--------------");

        // Calculates the number of UNIQUE elements in the stream;
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        System.out.println("Count of unique elements = " + stream1.distinct().count());
    }
}
