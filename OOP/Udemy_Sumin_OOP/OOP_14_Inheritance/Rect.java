package OOP.Udemy_Sumin_OOP.OOP_14_Inheritance;

public class Rect extends Figure {
    public Rect(double a, double b) {
        super(a, b);
    }

    public Rect(double size) {
        super(size, size);
    }

    @Override
    public double area() {
        return getA() * getB();
    }
}
