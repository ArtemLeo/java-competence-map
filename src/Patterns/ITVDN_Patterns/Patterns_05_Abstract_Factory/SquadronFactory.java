package Patterns.ITVDN_Patterns.Patterns_05_Abstract_Factory;

public abstract class SquadronFactory {
    public abstract Mage createMage();

    public abstract Archer createArcher();

    public abstract Warrior createWarrior();
}
