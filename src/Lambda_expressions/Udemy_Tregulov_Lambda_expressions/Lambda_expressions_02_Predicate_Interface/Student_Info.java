package Lambda_expressions.Udemy_Tregulov_Lambda_expressions.Lambda_expressions_02_Predicate_Interface;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Student_Info {
    void testStudent(ArrayList<Student> arrayList, Predicate<Student> predicate) {
        for (Student s : arrayList) {
            if (predicate.test(s)) {
                System.out.println(s);
            }
        }
    }
}
