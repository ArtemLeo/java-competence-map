package OOP.Udemy_Sumin_OOP.OOP_13_Inheritance.CatFamily;

public class Cat extends CatFamily {
    public Cat() {
        super(2, 4, false);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("I`m a Cat");
    }
}
