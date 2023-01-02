package OOP.Udemy_Sumin_OOP.OOP_06_Overloading_methods_constructors;

public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        int result = test.multiple(6,5);
        System.out.println(result);
        System.out.println("-------------------------");

        double result1 = test.multiple(6.3,5.8);
        System.out.println(result1);
        System.out.println("-------------------------");

        int result2 = test.multiple(5);
        System.out.println(result2);
        System.out.println("-------------------------");

        double result3 = Test.multiple(2.3);
        System.out.println(result3);
        System.out.println("-------------------------");

        Box box = new Box(10);
        Box box1 = new Box(15,20,25);
        box.showVolume();
        box1.showVolume();
        Box box2 = new Box();
        box2.showVolume();

    }
}
