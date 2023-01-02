package Patterns.ITVDN_Patterns.Patterns_11_Bridge;

public class Main {
    public static void main(String[] args) {
        Car car = new Hatchback(new BMW());
        car.showDetails();
    }
}

abstract class Car {
    Model model;

    public Car(Model model) {
        this.model = model;
    }

    abstract void showDetails();
}

interface Model {
    void setModel();
}

class Sedan extends Car {
    public Sedan(Model model) {
        super(model);
    }

    @Override
    void showDetails() {
        System.out.println("Sedan");
        model.setModel();
    }
}

class Hatchback extends Car {

    public Hatchback(Model model) {
        super(model);
    }

    @Override
    void showDetails() {
        System.out.println("Hatchback");
        model.setModel();
    }
}

class BMW implements Model {

    @Override
    public void setModel() {
        System.out.println("BMW");
    }
}

class Honda implements Model {

    @Override
    public void setModel() {
        System.out.println("Honda");
    }
}