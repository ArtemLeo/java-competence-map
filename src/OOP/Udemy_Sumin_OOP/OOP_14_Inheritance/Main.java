package OOP.Udemy_Sumin_OOP.OOP_14_Inheritance;

public class Main {
    public static void main(String[] args) {
        Rect rect = new Rect(5, 10);
        Triangle triangle = new Triangle(10);
        System.out.println("Area rect = " + rect.area());
        System.out.println("Area triangle = " + triangle.area());
    }
}
