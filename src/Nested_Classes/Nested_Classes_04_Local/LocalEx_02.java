package Nested_Classes.Nested_Classes_04_Local;

public class LocalEx_02 {
    public static void main(String[] args) {
        Mathematics mathematics = new Mathematics();
        mathematics.getResult(21, 5);
    }
}

class Mathematics {
    public void getResult(int delimoe, int delitel) {
        class Delenie {
            public int getChastnoe() {
                return delimoe / delitel;
            }
            public int getOstatok() {
                return delimoe % delitel;
            }
        }
        Delenie delenie = new Delenie();
        System.out.println("Delimoe = " + delimoe);
        System.out.println("Delitel = " + delitel);
        System.out.println("Chastnoe = " + delenie.getChastnoe());
        System.out.println("Ostatok = " + delenie.getOstatok());
    }
}