package Nested_Classes.Nested_Classes_05_Anonymous;

public class Main {
    public static void main(String[] args) {

        Math math = new Math() {
            @Override
            public int doOperation(int a, int b) {
                return a + b;
            }
        };
        System.out.println(math.doOperation(3, 7));

        Math math2 = new Math() {
            @Override
            public int doOperation(int a, int b) {
                return a * b;
            }
        };
        System.out.println(math2.doOperation(3, 5));

        Math2 math3 = new Math2() {
            @Override
            public int doOperation2(int c, int d) {
                return c + d;
            }
        };
        System.out.println(math3.doOperation2(6, 4));
    }
}

interface Math {
    int doOperation(int a, int b);
}

class Math2 {
    int doOperation2(int c, int d) {
        return c + d;
    }

}

