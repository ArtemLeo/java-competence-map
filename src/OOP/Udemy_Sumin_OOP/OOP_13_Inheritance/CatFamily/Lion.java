package OOP.Udemy_Sumin_OOP.OOP_13_Inheritance.CatFamily;

public class Lion extends CatFamily {
    public Lion(){
        super(2,4,true);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("I`m a Lion");;
    }
}
