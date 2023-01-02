package Patterns.ITVDN_Patterns.Patterns_04_Builder;

public class Main {
    public static void main(String[] args) {
        Car car = new CarBuilder().buildMake("Mercedes").buildTransmission(Transmission.AUTO).buildSpeed(240).build();
        System.out.println(car);
    }
}

enum Transmission {
    AUTO, MANUAL
}

class Car {
    String make = "Default";
    Transmission transmission = Transmission.MANUAL;
    int maxSpeed = 120;

    public void setMake(String make) {
        this.make = make;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", transmission=" + transmission +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}

class CarBuilder {
    String make;
    Transmission transmission;
    int speed;

    CarBuilder buildMake(String make) {
        this.make = make;
        return this;
    }

    CarBuilder buildTransmission(Transmission transmission) {
        this.transmission = transmission;
        return this;
    }

    CarBuilder buildSpeed(int speed) {
        this.speed = speed;
        return this;
    }

    Car build() {
        Car car = new Car();
        car.setMake(make);
        car.setTransmission(transmission);
        car.setMaxSpeed(speed);
        return car;
    }
}
