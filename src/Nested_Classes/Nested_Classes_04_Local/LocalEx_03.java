package Nested_Classes.Nested_Classes_04_Local;

public class LocalEx_03 {
    public static void main(String[] args) {
        class Slojenie implements InterfaceMath {
            @Override
            public int doOperation(int a, int b) {
                return a + b;
            }
        }
        Slojenie slojenie = new Slojenie();
        System.out.println(slojenie.doOperation(5,3));
    }
}

interface InterfaceMath {
    int doOperation(int a, int b);
}
