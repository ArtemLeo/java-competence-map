package Stream_API.Udemy_Tregulov_Streams_API.Stream_API_06_Chaining_method;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {3, 8, 1, 5, 9, 12, 4, 21, 81, 7, 18};
        int result = Arrays.stream(array).filter(e -> (e % 2) == 1).map(e -> {
            if (e % 3 == 0) {
                e = e / 3;
            }
            return e;
        }).reduce((a, e) -> a + e).getAsInt();
        System.out.println("result = " + result);
    }
}

