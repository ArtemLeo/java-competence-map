package Interfaces.Udemy_Tregulov_Interfaces.Interfaces_03_Predicate;

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
