package OOP.Enlite_OOP.OOP_02_Example;

import java.util.Arrays;

public class Course {
    private final String courseName;
    private final String[] students = new String[100];
    private int count = 0;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students[count] = student;
        count++;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCount() {
        return count;
    }

    public String[] getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", students=" + Arrays.toString(students) +
                ", count=" + count +
                '}';
    }
}
