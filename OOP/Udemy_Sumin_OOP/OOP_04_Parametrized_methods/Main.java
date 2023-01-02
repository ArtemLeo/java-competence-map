package OOP.Udemy_Sumin_OOP.OOP_04_Parametrized_methods;

public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        int square = test.square(15);
        System.out.println(square);
        System.out.println("------------------");

        Box box = new Box();
        box.setDimens(15,15,15);
        System.out.println(box.volume());
    }
}
