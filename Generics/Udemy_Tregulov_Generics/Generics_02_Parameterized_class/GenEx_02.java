package Generics.Udemy_Tregulov_Generics.Generics_02_Parameterized_class;

public class GenEx_02 {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("Hello", 20);
        System.out.println("First value = " + pair1.getValue1() + "; Second value = " + pair1.getValue2());
        Pair<Integer, Double> pair2 = new Pair<>(20, 3.14);
        System.out.println("First value = " + pair2.getValue1() + "; Second value = " + pair2.getValue2());
        OtherPair<Integer> otherPair = new OtherPair<>(30, 40);
        System.out.println("First value = " + otherPair.getValue1() + "; Second value = " + otherPair.getValue2());
    }
}

class Pair<V1, V2> {
    private V1 value1;
    private V2 value2;

    public V1 getValue1() {
        return value1;
    }

    public V2 getValue2() {
        return value2;
    }

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }
}

class OtherPair<V> {
    private V value1;
    private V value2;

    public V getValue1() {
        return value1;
    }

    public V getValue2() {
        return value2;
    }

    public OtherPair(V value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }
}
