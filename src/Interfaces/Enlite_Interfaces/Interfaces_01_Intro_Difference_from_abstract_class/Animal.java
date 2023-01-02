package Interfaces.Enlite_Interfaces.Interfaces_01_Intro_Difference_from_abstract_class;

public class Animal implements Sleepable {
    public void walk() {
        System.out.println("Animal is walking!");
    }

    @Override
    public void sleep() {
        System.out.println("Animal is sleeping!");
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
