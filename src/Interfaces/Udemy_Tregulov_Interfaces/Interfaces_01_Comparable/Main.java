package Interfaces.Udemy_Tregulov_Interfaces.Interfaces_01_Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(15, "Tom", 1000);
        Employee emp2 = new Employee(52, "Anna", 1200);
        Employee emp3 = new Employee(37, "Artem", 1700);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println("Before sorting: \n" + list);
        Collections.sort(list);
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

        /*
        - Короткий способ для "compareTo" для Integer;

        return this.id-anotherEmp.id;

        - Короткий способ для "compareTo" для String;

        return this.name.compareTo(anotherEmp.name)

        - Если имена совпадают, то + проверка по фамилии;

        int result = this.name.compareTo(anotherEmp.name);
        if(result==0) {
        result = this.surname.compareTo(anotherEmp.surname);
        }
        return result;
        */
    }
}
