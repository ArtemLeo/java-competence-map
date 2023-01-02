package OOP.Udemy_Alishev_OOP.OOP_06_This;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.setName("Tom");
        human.setAge(18);
        human.getInfo();
    }
}

class Human {
    String name;
    int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void getInfo() {
        System.out.println(name + ", " + age);
    }
}