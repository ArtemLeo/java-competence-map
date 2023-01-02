package OOP.Udemy_Sumin_OOP.OOP_06_Overloading_methods_constructors;

public class Test {
    int multiple(int a, int b) {
        return a * b;
    }

    double multiple(double a, double b) {
        return a * b;
    }

    int multiple(int a) {
        return a * a;
    }

    static double multiple(double a) {
        return a * a;
    }
}
