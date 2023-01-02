package OOP.Udemy_Sumin_OOP.OOP_14_Inheritance;

public abstract class Figure {
    private double a;
    private double b;

    public final double getA() {
        return a;
    }

    public final double getB() {
        return b;
    }

    public Figure(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public abstract double area();
}
