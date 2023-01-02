package OOP.Udemy_Sumin_OOP.OOP_13_Inheritance.CatFamily;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Lion lion = new Lion();
        cat.showInfo();
        lion.showInfo();
        cat.eat();
        lion.eat();
    }
}
