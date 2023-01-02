package Stream_API.Udemy_Tregulov_Streams_API.Stream_API_17_Parallel_Stream;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(10.0);
        list.add(5.0);
        list.add(1.0);
        list.add(0.25);

        // parallelStream - used for large amounts of information;
        double sumResult = list.parallelStream().reduce((accumulator, element) -> accumulator + element).get();
        System.out.println("sumResult: " + sumResult);

        // parallelStream - used only if the order in which elements are used in the current operation does not matter;
        // For example, "+" when the sum does not change from a change of members;
    }
}
