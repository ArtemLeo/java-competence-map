package Patterns.ITVDN_Patterns.Patterns_02_FactoryMethod;

public class Jeep implements Car{

    @Override
    public void drive() {
        System.out.println("Jeep is drive!");
    }

    @Override
    public void stop() {
        System.out.println("Jeep is stop!");
    }
}
