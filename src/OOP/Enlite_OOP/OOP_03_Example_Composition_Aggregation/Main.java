package OOP.Enlite_OOP.OOP_03_Example_Composition_Aggregation;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Composition
        Heart heart = new Heart();
        Human human = new Human(heart);
        human.getHeart().pounding();
        System.out.println("---------------------------------");

        // Aggregation
        Drivers driver1 = new Drivers("Tom", 1);
        Drivers driver2 = new Drivers("Jack", 2);
        Drivers driver3 = new Drivers("Alan", 3);

        List<Drivers> drivers = new ArrayList<>();
        drivers.add(driver1);
        drivers.add(driver2);
        drivers.add(driver3);

        Company company = new Company();
        company.setDrivers(drivers);

        for (Drivers d : company.getDrivers()) {
            System.out.println(d.getName() + " " + d.id);
        }
    }
}
