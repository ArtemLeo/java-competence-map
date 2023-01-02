package Patterns.ITVDN_Patterns.Patterns_02_FactoryMethod;

public class Porsche implements Car{
    @Override
    public void drive() {
        System.out.println("Porsche is drive!");
    }

    @Override
    public void stop() {
        System.out.println("Porsche is stop!");
    }
}
