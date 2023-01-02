package Generics.Udemy_Alishev_Generics.Generics_02_Wildcards;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(new Animal(1));
        listOfAnimal.add(new Animal(2));

        List<Dog> listOfDog = new ArrayList<>();
        listOfDog.add(new Dog());
        listOfDog.add(new Dog());

        test(listOfAnimal);
        test(listOfDog);
    }

    /*
       Wildcard <? super Animal>

       Object\
               (super)
       Animal/
       Animal\
               (extends)
          Dog/

       Wildcard <? extends Animal>
     */
    private static void test(List<? extends Animal>list){
        for (Animal animal:list){
            animal.eat();
        }
    }

    private static void test2(List<? super Animal>list){}
}
