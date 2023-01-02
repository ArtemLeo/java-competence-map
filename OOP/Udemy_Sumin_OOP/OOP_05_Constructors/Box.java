package OOP.Udemy_Sumin_OOP.OOP_05_Constructors;

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

    void setDimens(double width, double height, double length){
        this.width = width;
        this.height = height;
        this.length = length;
    }

    double volume() {
        return width * height * length;
    }
}
