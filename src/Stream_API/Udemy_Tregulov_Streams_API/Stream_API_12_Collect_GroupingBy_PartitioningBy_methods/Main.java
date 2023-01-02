package Stream_API.Udemy_Tregulov_Streams_API.Stream_API_12_Collect_GroupingBy_PartitioningBy_methods;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Niki", 'f', 22, 3, 8.4);
        Student st2 = new Student("Tomas", 'm', 24, 4, 9.7);
        Student st3 = new Student("Denis", 'm', 21, 2, 7.3);
        Student st4 = new Student("Zack", 'm', 22, 1, 6.4);
        Student st5 = new Student("Anton", 'm', 23, 4, 6.9);

        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        // GroupingBy - group students into "Lists" by course (the course is the Key of the Map);
        Map<Integer, List<Student>> map = students.stream().map(el -> {
                    el.setName(el.getName().toUpperCase());
                    return el;
                })
                .collect(Collectors.groupingBy(el -> el.getCourse()));
        // Output with forEach;
        for (Map.Entry<Integer, List<Student>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue().toString());
        }
        System.out.println("------------------------------------------------");

        // PartitioningBy - divide students into groups based on grades (< 7, > 7);
        Map<Boolean,List<Student>> map1 = students.stream()
                .collect(Collectors.partitioningBy(el -> el.getAvgGrade()>7));
        // Output with forEach;
        for (Map.Entry<Boolean, List<Student>> entry : map1.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue().toString());
        }
    }
}

