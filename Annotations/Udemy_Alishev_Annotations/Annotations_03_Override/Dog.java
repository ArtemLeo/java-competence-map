package Annotations.Udemy_Alishev_Annotations.Annotations_03_Override;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("Dog is eating!");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping!");
    }
}
