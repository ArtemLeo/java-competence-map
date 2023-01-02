package Interfaces.Enlite_Interfaces.Interfaces_02_Comparable;

public class Man implements Comparable<Man> {
    private final int id;
    private final String name;

    public Man(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Man{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Man m) {
        if (this.id - m.id < 0) {
            return -1;
        } else if (this.id - m.id == 0) {
            return 0;
        } else {
            return 1;
        }
    }
}
