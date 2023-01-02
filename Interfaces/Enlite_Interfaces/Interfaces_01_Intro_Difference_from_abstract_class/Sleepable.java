package Interfaces.Enlite_Interfaces.Interfaces_01_Intro_Difference_from_abstract_class;

public interface Sleepable extends Cloneable, Comparable {
    // All variables in default interfaces: public, final, static
    public final static int X = 5;

    // All methods in default interface: public, abstract
    public abstract void sleep();

    // The interface can !!extends!! other interfaces
}
