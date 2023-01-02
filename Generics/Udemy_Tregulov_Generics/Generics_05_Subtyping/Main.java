package Generics.Udemy_Tregulov_Generics.Generics_05_Subtyping;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Создание объекта через родительский класс;
        X x = new Y();

        // Для Generics эта возможность отсутствует - будет ошибка;
        // List<X> list = new ArrayList<>(Y);
    }
}

class X {
}

class Y extends X {
}

// Ограничения для значения Placeholder <T extends Number>;

class Information<T extends Number> {
    private T value;

    public Information(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "{[" + value + "]}";
    }

    public T getValue() {
        return value;
    }
}

// Для параметризованных методов, ограничения тоже работают;

class SomeMethod {
    public static <T extends Number> T getSecondElement(ArrayList<T> arrayList) {
        return arrayList.get(1);
    }
}

// Имплементацию интерфейсов в параметризованные классы, добавляем через "&";
// class Info<T extends Number&Interface1&Interface2>

