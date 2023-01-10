package Multithreading.Udemy_Tregulov_Multithreading.Multithreading_13_Interfaces_Callable_Future.Callable_Future_01;

import java.util.concurrent.*;

public class Main {
    static int factorialResult;

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // Factorial 5! = 1 * 2 * 3 * 4 * 5 = 120;
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factorial factorial = new Factorial(5);
        executorService.execute(factorial);
        Future future = executorService.submit(factorial);        // code of next lesson;
        executorService.shutdown();
        executorService.awaitTermination(10, TimeUnit.SECONDS);
        System.out.println("future.get() = " + future.get());     // code of next lesson;
        System.out.println("future.isDone() = " + future.isDone());  // code of next lesson;
        System.out.println("factorialResult = " + factorialResult);
    }
}

class Factorial implements Runnable {
    int f;

    public Factorial(int f) {
        this.f = f;
    }

    @Override
    public void run() {
        if (f <= 0) {
            System.out.println("You entered the wrong number!");
            return;
        }
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result *= i;
        }
        Main.factorialResult = result;
    }
}