package Collection.Udemy_Tregulov_Collections.Collection_06_ClassCollections_Method_BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmployeeList {
    public static void main(String[] args) {
        Employee employee1 = new Employee(100, "Zack", 9332);
        Employee employee2 = new Employee(15, "Ivan", 6435);
        Employee employee3 = new Employee(123, "Petr", 4342);
        Employee employee4 = new Employee(15, "Mariya", 2521);
        Employee employee5 = new Employee(182, "Anna", 6305);
        Employee employee6 = new Employee(15, "Sasha", 4824);
        Employee employee7 = new Employee(250, "Elena", 4332);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        employeeList.add(employee6);
        employeeList.add(employee7);
        System.out.println(employeeList);
        System.out.println("---------------------------");

        Collections.sort(employeeList);
        System.out.println(employeeList);
        System.out.println("---------------------------");

        int index = Collections.binarySearch(employeeList, new Employee(182, "Anna", 6305));
        System.out.println(index);
        System.out.println("---------------------------");

        // Поиск в массиве (Arrays.sort + Arrays.binarySearch);
        int[] array = {-3, 8, 12, -8, 0, 5, 10, 1, 150, -30, 19};
        System.out.println(Arrays.toString(array));
        System.out.println("---------------------------");

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("---------------------------");

        int indexArr = Arrays.binarySearch(array, 150);
        System.out.println(indexArr);
        System.out.println("---------------------------");
    }
}

class Employee implements Comparable<Employee> {
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee anotherEmp) {
        int result = this.id - anotherEmp.id;
        if (result == 0) {
            result = this.name.compareTo(anotherEmp.name);
        }
        return result;
    }
}
