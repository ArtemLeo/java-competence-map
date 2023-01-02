package Regular_Expressions.Udemy_Tregulov_Regular_Expressions;

public class RegEx_07_Printf_Format {

    // printf method;
    static void employeeInfo(Employee employee) {
        System.out.printf("%03d \t %-12s \t %-12s \t %,.1f\n", employee.id, employee.name, employee.surname, employee.salary * (1 + employee.bonusPct));
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Tom", "Hurt", 4590, 0.15);
        Employee emp2 = new Employee(15, "Zoe", "Berk", 3780, 0.08);
        Employee emp3 = new Employee(21, "Ben", "Smith", 3540, 0.12);
        employeeInfo(emp1);
        employeeInfo(emp2);
        employeeInfo(emp3);

        // format method;
        String newString = String.format("%03d \t %-12s \t %-12s \t %,.1f", 1, "Tom", "Hurt", 4590 * (1 + 0.15));
        System.out.println(newString);
    }
}

class Employee {
    int id;
    String name;
    String surname;
    int salary;
    double bonusPct;

    public Employee(int id, String name, String surname, int salary, double bonusPct) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.bonusPct = bonusPct;
    }
}
