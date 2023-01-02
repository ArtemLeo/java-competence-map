package OOP.Udemy_Sumin_OOP.OOP_05_Constructors;

public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        System.out.println(box.volume());
        System.out.println("-----------------");

        Box box1 = new Box(30,30,30);
        System.out.println(box1.volume());
        System.out.println("-----------------");
    }
}
