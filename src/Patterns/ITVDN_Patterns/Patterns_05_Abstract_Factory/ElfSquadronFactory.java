package Patterns.ITVDN_Patterns.Patterns_05_Abstract_Factory;

public class ElfSquadronFactory extends SquadronFactory {
    @Override
    public Mage createMage() {
        return new ElfMage();
    }

    @Override
    public Archer createArcher() {
        return new ElfArcher();
    }

    @Override
    public Warrior createWarrior() {
        return new ElfWarrior();
    }
}

class ElfMage implements Mage {

    @Override
    public void cast() {
        // Use the magic of Elf;
        System.out.println("Magic is used!");
    }
}

class ElfArcher implements Archer {

    @Override
    public void shoot() {
        // Use the bow of Elf;
        System.out.println("Archer is shooting!");
    }
}

class ElfWarrior implements Warrior {

    @Override
    public void attack() {
        // Use the sword of Elf;
        System.out.println("Warrior attack!");
    }
}
