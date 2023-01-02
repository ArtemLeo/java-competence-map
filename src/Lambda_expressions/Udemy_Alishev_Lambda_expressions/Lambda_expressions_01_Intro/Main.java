package Lambda_expressions.Udemy_Alishev_Lambda_expressions.Lambda_expressions_01_Intro;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Lambda expression");
                System.out.println("-------------------------------------");
            }
        });
        thread.start();
        // Lambda expression of this "thread";
        // Thread thread = new Thread(() -> System.out.println("Lambda expression"));

        Runner runner = new Runner();
        // Variant 1 - class implements interface + @Override method of interface;
        runner.run(new ExecutableImplementation() {
            @Override
            public int execute(int x, int y) {
                super.execute(5, 1);
                return x + y;
            }
        });
        System.out.println("-------------------------------------");

        // Variant 2 - @Override method of interface;
        runner.run(new Executable() {
            @Override
            public int execute(int x, int y) {
                System.out.println("Variant 2");
                y = 2;
                return x + y;
            }
        });
        System.out.println("-------------------------------------");

        // Variant 3 - lambda expressions;
        runner.run((x, y) -> {
            System.out.println("Variant 3");
            y = 2;
            final int a = 1;
            return x + y + a;
        });
        System.out.println("-------------------------------------");
    }
}

interface Executable {
    int execute(int x, int y);
}

class Runner {
    public void run(Executable e) {
        int i = e.execute(5, 1);
        System.out.println("return int " + i);
    }
}

// Variant 1;
class ExecutableImplementation implements Executable {

    @Override
    public int execute(int x, int y) {
        System.out.println("Variant 1");
        return 1;
    }
}
