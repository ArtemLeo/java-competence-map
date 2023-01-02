package Generics.Udemy_Tregulov_Generics.Generics_02_Parameterized_class;

public class GenEx_01 {
    public static void main(String[] args) {

        // <T> - type placeholder;
        Info<String> info1 = new Info<>("Hello");
        System.out.println(info1);
        String s = info1.getValue();
        System.out.println(s);

        Info<Integer> info2 = new Info<>(18);
        System.out.println(info2);
        Integer i = info2.getValue();
        System.out.println(i);
    }
}

class Info<T> {
    private T value;

    public Info(T value) {
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

