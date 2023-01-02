package Collection.Udemy_Tregulov_Collections.Collection_10_HashMap_Methods_Equals_HashCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();
        Student st1 = new Student("Becky", "Becky`s surname", 3);
        Student st2 = new Student("Zoe", "Zoe`s surname", 1);
        Student st3 = new Student("Den", "Den`s surname", 4);
        map.put(st1, 7.5);
        map.put(st2, 8.4);
        map.put(st3, 7.6);
        System.out.println(map);
        System.out.println("------------------------------");

        // Сравнение в map (поиск одинаковых ключей) через containsKey;
        Student st4 = new Student("Becky", "Becky`s surname", 3);
        boolean result = map.containsKey(st4);
        System.out.println("HashCode result = " + result);
        System.out.println("------------------------------");

        // Сравнение двух элементов через equals;
        System.out.println("Equals result = " + st1.equals(st4));
        System.out.println("------------------------------");

        // У одинаковых объектов = одинаковый hashcode;
        Student st5 = new Student("Igor", "Igor`s surname", 5);
        System.out.println(st1.hashCode());
        System.out.println(st4.hashCode());
        System.out.println(st2.hashCode());
        System.out.println(st5.hashCode());
        // st1.hashCode == st5.hashCode; (происходит) Коллизия - объекты разные, а hashCode одинаковый;
        System.out.println("------------------------------");

        // В основе HashMap находится массив ->
        // -> элементы массива являются структурами LinkedList ->
        // -> структуры заполняются элементами HashMap;
        // HashMap содержит внутренний класс Node, который имплементирует интерфейс Entry;
        // Node содержит: ключ - значение - hashcode - ссылку на следующий элемент;

        // entrySet - вывод ключей и значений;
        for (Map.Entry<Student, Double> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        System.out.println("------------------------------");

        // Начальные параметры HashMap;
        // Initial capacity - начальный размер массива;
        // Load factor - коэффициент заполненности массива (после размер будет увеличен вдвое);
        Map<Integer, String> map2 = new HashMap<>(16, 0.75f);
    }
}

final class Student {
    private final String name;
    private final String surname;
    private final int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    // При помощи hashCode происходит преобразование любого объекта в int;
    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
        // Условная альтернатива: return name.length() * 7 + surname.length() * 11 + course * 53;
    }
}
