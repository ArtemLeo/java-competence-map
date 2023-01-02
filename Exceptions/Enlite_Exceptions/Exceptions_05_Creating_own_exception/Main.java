package Exceptions.Enlite_Exceptions.Exceptions_05_Creating_own_exception;

public class Main {
    public static void main(String[] args) {
        try {
            new Radius(9);
            new Radius(2);
            new Radius(7);
            new Radius(-5);
            new Radius(2);
        } catch (NegativeRadiusException ex) {
            System.out.println("Negative radius is caught!" + ex.getRadius());
        }
        System.out.println("Positive radius count = " + Radius.getCount());
    }
}

class Radius {
    int radius;
    static int count = 0;

    public Radius(int radius) throws NegativeRadiusException {
        if (radius < 0) throw new NegativeRadiusException(radius);
        this.radius = radius;
        count++;
    }

    public static int getCount() {
        return count;
    }
}
