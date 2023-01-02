package Generics.Udemy_Alishev_Generics.Generics_01_Intro;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // До появления Generics использовали down-casting от класса Object.
        List<String> animal = new ArrayList<>();
        animal.add("dog");
        animal.add("cat");
        animal.add("frog");
        String someAnimal = animal.get(1);
        System.out.println(someAnimal);
    }
}