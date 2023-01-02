package Generics.Udemy_Tregulov_Generics.Generics_07_Example;

public class Main {
    public static void main(String[] args) {
        Scholar scholar1 = new Scholar("Artem",13);
        Scholar scholar2 = new Scholar("Anna",15);
        Scholar scholar3 = new Scholar("Ilya",12);
        Scholar scholar4 = new Scholar("Sergey",14);

        Student student1 = new Student("Nikolay",20);
        Student student2 = new Student("Mariya",21);

        Employee employee1 = new Employee("Artem",32);
        Employee employee2 = new Employee("Mariya",30);

        Team<Scholar> scholarTeam = new Team<>("Dragoni!");
        Team<Scholar> scholarTeam1 = new Team<>("MoveOn!");
        Team<Student> studentTeam = new Team<>("GetUp!");
        Team<Employee> employeeTeam = new Team<>("ComeOn!");

        scholarTeam.addNewParticipant(scholar1);
        scholarTeam.addNewParticipant(scholar2);
        scholarTeam1.addNewParticipant(scholar3);
        scholarTeam1.addNewParticipant(scholar4);
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);
        System.out.println(" ");
        scholarTeam.playWith(scholarTeam1);
    }
}
