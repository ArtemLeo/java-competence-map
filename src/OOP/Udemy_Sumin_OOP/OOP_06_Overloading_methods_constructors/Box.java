package OOP.Udemy_Sumin_OOP.OOP_06_Overloading_methods_constructors;

public class Box {
    double width;
    double height;
    double length;

    // Constructor without parameters;
    public Box() {
        width = 10;
        height = 10;
        length = 10;
    }

    // Constructor with parameters;
    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Box(double size) {
        width = size;
        height = size;
        length = size;
    }

    void setDimens(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    double volume() {
        return width * height * length;
    }

    void showVolume() {
        double volume = width * height * length;
        System.out.println(volume);
    }
}
