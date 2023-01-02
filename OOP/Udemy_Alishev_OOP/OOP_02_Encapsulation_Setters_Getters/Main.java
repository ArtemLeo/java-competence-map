package OOP.Udemy_Alishev_OOP.OOP_02_Encapsulation_Setters_Getters;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Tom");
        person1.setAge(25);

        person1.sayHello();
        System.out.println("My name is " + person1.getName() + ". I`m " + person1.getAge() + " years old.");
        // or
        person1.speak();
        System.out.println("---------------------------------");

    }
}

class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // Check for empty input;
        if (name.isEmpty()) {
            System.out.println("You entered an empty name");
        } else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // Checking for negative age;
        if (age < 0) {
            System.out.println("Age cannot be negative");
        } else {
            this.age = age;
        }
    }

    int calculateYearsToRetirement() {
        int years = 65 - age;
        return years;
    }

    void sayHello() {
        System.out.println("Hello!");
    }

    void speak() {
        System.out.println("My name is " + name + ". I`m " + age + " years old.");
    }
}