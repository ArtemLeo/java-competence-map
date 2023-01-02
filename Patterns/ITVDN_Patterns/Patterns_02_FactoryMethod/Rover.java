package Patterns.ITVDN_Patterns.Patterns_02_FactoryMethod;

public class Rover implements Car{
    @Override
    public void drive() {
        System.out.println("Rover is drive!");
    }

    @Override
    public void stop() {
        System.out.println("Rover is stop!");
    }
}
