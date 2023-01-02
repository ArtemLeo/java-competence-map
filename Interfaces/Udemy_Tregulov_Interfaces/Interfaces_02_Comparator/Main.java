package Interfaces.Udemy_Tregulov_Interfaces.Interfaces_02_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(15, "Anna", 1000);
        Employee emp2 = new Employee(52, "Zoe", 1200);
        Employee emp3 = new Employee(37, "Tom", 1700);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println("Before sorting: \n" + list);
        Collections.sort(list, new SalaryComparator()); // or IdComparator, or NameComparator, or SalaryComparator;
        System.out.println("After sorting: \n" + list);
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
        if (this.id == anotherEmp.id) {
            return 0;
        } else if (this.id < anotherEmp.id) {
            return -1;
        } else {
            return 1;
        }
    }
}

class IdComparator implements Comparator<Employee> {   // Сравниваем по "id";

    @Override
    public int compare(Employee emp1, Employee emp2) {
        if (emp1.id == emp2.id) {
            return 0;
        } else if (emp1.id < emp2.id) {
            return -1;
        } else {
            return 1;
        }
        // Альтернатива if: return Integer.compare(emp1.id, emp2.id);
    }
}

class NameComparator implements Comparator<Employee> {  // Сравнение по "name";
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.name.compareTo(emp2.name);
    }
}

class SalaryComparator implements Comparator<Employee> {  // Сравнение по "salary";
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.salary - emp2.salary;
    }
}
