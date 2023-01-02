package OOP.Enlite_OOP.OOP_05_Method_toString;

public class Example {
    String name;
    int id;

    public Example(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Example{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
