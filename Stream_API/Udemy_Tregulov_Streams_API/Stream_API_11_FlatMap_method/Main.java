package Stream_API.Udemy_Tregulov_Streams_API.Stream_API_11_FlatMap_method;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Olga", 'f', 22, 3, 8.4);
        Student st2 = new Student("Tom", 'm', 24, 5, 9.7);
        Student st3 = new Student("Den", 'm', 21, 2, 7.3);
        Student st4 = new Student("Artem", 'm', 22, 3, 7.4);
        Student st5 = new Student("Zack", 'm', 23, 4, 6.9);

        Faculty facultyEconomics = new Faculty("Economics");
        Faculty facultyMathematics = new Faculty("Mathematics");
        facultyEconomics.addStudentToFaculty(st1);
        facultyEconomics.addStudentToFaculty(st2);
        facultyEconomics.addStudentToFaculty(st3);
        facultyMathematics.addStudentToFaculty(st4);
        facultyMathematics.addStudentToFaculty(st5);

        List<Faculty> allFaculty = new ArrayList<>();
        allFaculty.add(facultyEconomics);
        allFaculty.add(facultyMathematics);

        // flatMap - access elements of element (List <Faculty> - Faculty - Student);
        allFaculty.stream().flatMap(f -> f.getStudentsOnFaculty().stream())
                .forEach(e -> System.out.println(e.getName()));
        System.out.println("------------------------");

        // Output of students of a single faculty (object-collection-stream);
        facultyEconomics.getStudentsOnFaculty().forEach(student -> System.out.println(student.getName()));
        System.out.println("------------------------");
        // or;
        facultyEconomics.studentsOnFaculty.forEach(student -> System.out.println(student.getName()));
    }
}

class Faculty {
    String name;
    List<Student> studentsOnFaculty;

    public Faculty(String name) {
        this.name = name;
        studentsOnFaculty = new ArrayList<>();
    }

    public List<Student> getStudentsOnFaculty() {
        return studentsOnFaculty;
    }

    public void addStudentToFaculty(Student st) {
        studentsOnFaculty.add(st);
    }
}