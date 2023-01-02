package Collection.Udemy_Sumin_Collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Memory device in Java;
        // Stack хранит значение переменных (примитивных) + ссылки на объекты в Heap;
        // Heap хранит значение объектов (ссылочных);
        // Через знак == можно сравнить только значения примитивных переменных и адреса ссылок на объекты в Heap;
        // Сами объекты сравниваются только через метод equals();

        Car car1 = new Car("BMW", 1);
        Car car2 = new Car("BMW", 1);
        car2 = car1;
        car2.setNumber(5);
        System.out.println("Car2 = " + car2.getNumber());
        System.out.println("Car1 = " + car1.getNumber());
        // Ссылки на объекты равны;
        System.out.println(car1 == car2);  // true;
        System.out.println("-----------------------");

        // Сравнение самих объектов с помощью equals();
        // Метод equals() необходимо переопределить в классе, чьи объекты сравниваются;
        Car car3 = new Car("BMW", 1);
        Car car4 = new Car("BMW", 1);
        Car car5 = new Car("BMW", 2);
        System.out.println(car3.equals(car4));
        System.out.println("-----------------------");

        // Hashcode - это представление объекта в виде числа (int);
        System.out.println("car3 = " + car3.hashCode());
        System.out.println("car4 = " + car4.hashCode());
        System.out.println("car5 = " + car5.hashCode());
        System.out.println("-----------------------");

        // Iterable;
        CarCollection cars = new CarArrayList();
        for (int i = 0; i < 10; i++) {
            cars.add(new Car("Brand" + i, i));
        }
        for (Car car : cars) {
            System.out.println(car.getBrand() + " " + car.getNumber());
        }
        System.out.println("-----------------------");

        // TreeSet;
        Set<Integer> numbers = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -o1.compareTo(o2);
            }
        });
        for (int i = 0; i < 100; i++) {
            numbers.add((int) (Math.random() * 10));
        }
        for (Integer number : numbers) {
            System.out.println(number);
        }
        System.out.println("-----------------------");

        Set<Car> cars1 = new TreeSet<>(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getBrand().compareTo(o2.getBrand());
            }
        });
        for (int i = 0; i < 30; i++) {
            cars1.add(new Car("Brand" + i, i));
        }
        for (Car car : cars1) {
            System.out.println(car);
        }
        System.out.println("-----------------------");

        // NullPointerException because "car" is null;
        HashMap<CarOwner, Car> map = new HashMap<>();
        CarOwner key = new CarOwner(1, "Name", "LastName");
        map.put(key, new Car("Brand1", 1));
        key.setId(8);
        Car car = map.get(key);
        // System.out.println(car.getBrand());
    }
}
