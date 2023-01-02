package OOP.Enlite_OOP.OOP_02_Example;

public class Main {
    public static void main(String[] args) {
        Course maths = new Course("Mathematics");
        maths.addStudent("John");
        maths.addStudent("Jack");
        maths.addStudent("Alice");

        Course physics = new Course("Physics");
        physics.addStudent("Adam");
        physics.addStudent("Anton");

        System.out.println(maths.getCourseName());
        for (int i = 0; i < maths.getCount(); i++) {
            System.out.println((i + 1) + " " + maths.getStudents()[i]);
        }
        System.out.println("---------------------------");

        System.out.println(physics.getCourseName());
        for (int i = 0; i < physics.getCount(); i++) {
            System.out.println((i + 1) + " " + physics.getStudents()[i]);
        }
    }
}
