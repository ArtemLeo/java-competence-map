package Interfaces.Enlite_Interfaces.Interfaces_03_Cloneable;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person(5, "Tom");
        // person1 and person2 - refer to a single link, if not used Cloneable;
        // Person person2 = person1;

        // Cloneable;
        Person person2 = person1.clone();
        System.out.println(person1);
        System.out.println(person2);
    }
}
