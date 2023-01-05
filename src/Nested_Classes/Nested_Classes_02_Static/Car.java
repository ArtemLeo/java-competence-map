package Nested_Classes.Nested_Classes_02_Static;

class Main {
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine(256);
        System.out.println(engine);
        Car car = new Car("red", 2, engine);
        System.out.println(car);
    }
}

public class Car {
    String color;
    int doorCount;
    Engine engine;
    private static int staticVariable;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "My car: {" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    void method() {
        System.out.println(Engine.countOfObjects); // Вывод static переменной nested класса;
        Engine x = new Engine(256);     // Вывод НЕ static переменной nested класса, через создание объекта nested класса;
        System.out.println(x.horsePower);
    }

    // Создаём nested static класс;
    public static class Engine {
        private int horsePower;
        static int countOfObjects;

        public Engine(int horsePower) {
            System.out.println(staticVariable); // Вывод private static переменной внешнего класса;
            this.horsePower = horsePower;
            countOfObjects++;
        }

        @Override
        public String toString() {
            return "My Engine: {" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}

