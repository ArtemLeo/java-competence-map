package OOP.Udemy_Sumin_OOP.OOP_01_Principles_OOP;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // ООП - это методология программирования, основанная на представлении программы в виде совокупности объектов,
        //       каждый из которых является экземпляром определённого класса, а классы образуют иерархию наследования.

        // Основные принципы ООП:
        // - Инкапсуляция
        // - Наследование
        // - Полиморфизм

        // Инкапсуляция - это сокрытие реализации, которая достигается при помощи модификаторов доступа. Разработчик
        //                делает открытыми (публичными) только те поля и методы, которые должны быть доступны за
        //                пределами класса.

        // Наследование - это процесс, благодаря которому один объект приобретает свойства другого, при этом может
        //                иметь черты, характерные только для него.

        // Полиморфизм - это процесс, основной идеей которого является принцип: один интерфейс - множество реализаций.

        Programmer programmer = new Programmer();
        Chief chief = new Chief();

        List<Employee> employees = new ArrayList<>();
        employees.add(programmer);   //or employees.add(new Programmer);
        employees.add(chief);        //or employees.add(new Chief);

        for (Employee employee: employees){
            employee.work();
        }

    }
}
