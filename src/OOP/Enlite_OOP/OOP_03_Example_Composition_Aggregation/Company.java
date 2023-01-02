package OOP.Enlite_OOP.OOP_03_Example_Composition_Aggregation;

import java.util.List;

public class Company {
    List<Drivers> drivers;

    public void setDrivers(List<Drivers> drivers) {
        this.drivers = drivers;
    }

    public List<Drivers> getDrivers() {
        return drivers;
    }
}
