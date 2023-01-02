package Collection.Udemy_Tregulov_Collections.Collection_07_Vector;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Tom");
        vector.add("Anna");
        vector.add("Den");
        System.out.println(vector);
        System.out.println("-----------------------");

        System.out.println(vector.firstElement());
        System.out.println("-----------------------");

        System.out.println(vector.lastElement());
        System.out.println("-----------------------");

        vector.remove(1);
        System.out.println(vector);
        System.out.println("-----------------------");

        System.out.println(vector.get(0));
    }
}
