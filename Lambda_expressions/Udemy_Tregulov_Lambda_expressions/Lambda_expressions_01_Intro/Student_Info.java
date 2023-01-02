package Lambda_expressions.Udemy_Tregulov_Lambda_expressions.Lambda_expressions_01_Intro;

import java.util.ArrayList;

public class Student_Info {
    void printStudentOverGrade(ArrayList<Student> al, double grade) {
        for (Student s : al) {
            if (s.avgGrade > grade) {
                System.out.println(s);
            }
        }
    }

    void printStudentUnderAge(ArrayList<Student> al, int age) {
        for (Student s : al) {
            if (s.age < age) {
                System.out.println(s);
            }
        }
    }

    void printStudentMixCondition(ArrayList<Student> al, int age, double grade, char sex) {
        for (Student s : al) {
            if (s.age > age && s.avgGrade > grade && s.sex == sex) {
                System.out.println(s);
            }
        }
    }

    void testStudents(ArrayList<Student> arrayList, StudentChecks sc) {
        for (Student s : arrayList) {
            if (sc.check(s)) {
                System.out.println(s);
            }
        }
    }
}

interface StudentChecks {
    boolean check(Student s);
}

class CheckOverGrade implements StudentChecks {
    @Override
    public boolean check(Student s) {
        return s.avgGrade > 8;
    }
}

