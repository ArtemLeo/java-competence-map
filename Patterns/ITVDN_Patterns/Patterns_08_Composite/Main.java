package Patterns.ITVDN_Patterns.Patterns_08_Composite;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Shape square1 = new Square();
        Shape square2 = new Square();
        Shape triangle1 = new Triangle();

        Shape square3 = new Square();
        Shape circle1 = new Circle();
        Shape circle2 = new Circle();
        Shape circle3 = new Circle();

        Composite composite1 = new Composite();
        Composite composite2 = new Composite();
        Composite composite3 = new Composite();

        composite2.addComponents(square1);
        composite2.addComponents(square2);
        composite2.addComponents(triangle1);

        composite3.addComponents(square3);
        composite3.addComponents(circle1);
        composite3.addComponents(circle2);
        composite3.addComponents(circle3);

        composite1.addComponents(composite2);
        composite1.addComponents(composite3);

        composite1.draw();
        System.out.println("-----------------------");
        composite3.draw();
        System.out.println("-----------------------");
        square2.draw();
    }
}

interface Shape {
    void draw();
}

class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("This is square!");
    }
}

class Triangle implements Shape {

    @Override
    public void draw() {
        System.out.println("This is triangle!");
    }
}

class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("This is circle!");
    }
}

class Composite implements Shape {
    private List<Shape> components = new ArrayList<>();

    public void addComponents(Shape component) {
        components.add(component);
    }

    public void removeComponents(Shape component) {
        components.remove(component);
    }

    @Override
    public void draw() {
        for (Shape component : components) {
            component.draw();
        }
    }
}