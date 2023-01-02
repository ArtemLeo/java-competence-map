package Annotations.Udemy_Tregulov_Annotations.Annotations_01_Override_Deprecated;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Child("Tom");
        parent.showInfo();
    }
}

class Parent {
    String name;

    public Parent(String name) {
        this.name = name;
    }

    @Deprecated
    void showInfo() {
        System.out.println("It`s Parent class! Name = " + name);
    }
}

class Child extends Parent {

    public Child(String name) {
        super(name);
    }

    @Override
    void showInfo() {
        System.out.println("It`s Child class! Name = " + name);
    }
}
