package Patterns.ITVDN_Patterns.Patterns_07_Facade;

public class Main {
    public static void main(String[] args) {
        // Code without pattern Facade
        Power power = new Power();
        power.on();
        DVDRom dvdRom = new DVDRom();
        dvdRom.load();
        HDD hdd = new HDD();
        hdd.copyFromDVD(dvdRom);
        System.out.println("--------------------------------");

        // Code with pattern Facade
        Computer computer = new Computer();
        computer.copy();
    }
}

class Computer{
    Power power = new Power();
    DVDRom dvdRom = new DVDRom();
    HDD hdd = new HDD();

    void copy(){
        power.on();
        dvdRom.load();
        hdd.copyFromDVD(dvdRom);
    }
}

class Power {
    void on() {
        System.out.println("System ON!");
    }

    void of() {
        System.out.println("System OFF!");
    }
}

class DVDRom {
    private boolean data = false;

    public boolean hasData() {
        return data;
    }

    void load() {
        data = true;
    }

    void unload() {
        data = false;
    }
}

class HDD {
    void copyFromDVD(DVDRom dvd) {
        if (dvd.hasData()) {
            System.out.println("Data is copied from the disk!");
        } else {
            System.out.println("Insert the data disc!");
        }
    }
}
