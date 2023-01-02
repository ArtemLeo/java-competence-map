package OOP.Udemy_Sumin_OOP.OOP_13_Inheritance.CatFamily;

public class CatFamily {
    private int ears;
    private int legs;
    private boolean bigClaws;

    public void setBigClaws(boolean bigClaws) {
        this.bigClaws = bigClaws;
    }

    public CatFamily(int ears, int legs, boolean bigClaws) {
        this.ears = ears;
        this.legs = legs;
        this.bigClaws = bigClaws;
    }

    public void showInfo() {
        System.out.println("Ears = " + ears + ", Legs = " + legs + ", Big Claws = " + bigClaws);
    }

    public void eat() {
        System.out.print("I`m eating. ");
    }
}
