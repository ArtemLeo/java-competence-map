package Exceptions.Enlite_Exceptions.Exceptions_05_Creating_own_exception;

public class NegativeRadiusException extends Exception {
    int radius;

    public NegativeRadiusException() {
    }

    public NegativeRadiusException(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
}
