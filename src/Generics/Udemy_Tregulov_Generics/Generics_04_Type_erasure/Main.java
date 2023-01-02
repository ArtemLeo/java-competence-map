package Generics.Udemy_Tregulov_Generics.Generics_04_Type_erasure;

public class Main {
    public static void main(String[] args) {
    }

    class Info<T> {
        private T value;

        public T getValue() {
            return value;
        }
    }

    // Информация о Generics стирается, поэтому оба метода ниже для JVM выглядят одинаково - typeErasure (Info info);

    // public void typeErasure(Info<String> info) {String s = info.getValue();}

    public void typeErasure(Info<Integer> info) {
        Integer i = info.getValue();
    }

    class Parent {
        public void typeErasure(Info<String> info) {String s = info.getValue();}
    }

    // Наследование подобных методов - приводит к ошибке;

    class Child extends Parent {
       // public void typeErasure(Info<Integer> info) {Integer i = info.getValue();}
    }
}

