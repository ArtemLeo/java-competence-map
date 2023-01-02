package Generics.Udemy_Tregulov_Generics.Generics_07_Example;

public abstract class Participant {
    private String name;
    private  int age;

    public Participant(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
