package Patterns.ITVDN_Patterns.Patterns_02_FactoryMethod;

public class Main {
    public static void main(String[] args) {
        Car car = CarSelector.getInstance().getCar(RoadType.CITY);
        car.stop();
        System.out.println("---------------------");

        car = CarSelector.getInstance().getCar(RoadType.OFF_ROAD);
        car.drive();
        car.stop();
        System.out.println("---------------------");

        car = CarSelector.getInstance().getCar(RoadType.MOUNTAINS);
        car.drive();
    }
}
