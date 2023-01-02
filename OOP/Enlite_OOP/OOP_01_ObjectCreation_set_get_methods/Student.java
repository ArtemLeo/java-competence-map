package OOP.Enlite_OOP.OOP_01_ObjectCreation_set_get_methods;

public class Student {
    private int age;
    private int weight;
    private String name;
    private String surname;

    public Student() {
    }

    public Student(int age, int weight, String name, String surname) {
        this.age = age;
        this.weight = weight;
        this.name = name;
        this.surname = surname;
    }

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
