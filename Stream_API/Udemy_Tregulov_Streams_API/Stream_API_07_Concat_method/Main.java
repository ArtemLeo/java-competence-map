package Stream_API.Udemy_Tregulov_Streams_API.Stream_API_07_Concat_method;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> stream2 = Stream.of(6, 7, 8, 9, 10);
        Stream<Integer> streamConcat = Stream.concat(stream1, stream2);
        streamConcat.forEach(e-> System.out.println(e));
    }
}
