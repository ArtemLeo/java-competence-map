package Multithreading.Udemy_Tregulov_Multithreading.Multithreading_13_Interfaces_Callable_Future.Callable_Future_02;

import java.util.concurrent.*;

public class Main {
    static int factorialResult;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factorial factorial = new Factorial(5);
        Future future = executorService.submit(factorial);
        try {
            System.out.println("Method isDone() - " + future.isDone());
            System.out.println("We want to see result!");
            factorialResult = (int) future.get();
            System.out.println("We got the result!");
            System.out.println("Method isDone() - " + future.isDone());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            System.out.println(e.getCause());
        } finally {
            executorService.shutdown();
        }
        System.out.println(factorialResult);
    }
}

class Factorial implements Callable<Integer> {
    int f;

    public Factorial(int f) {
        this.f = f;
    }

    @Override
    public Integer call() throws Exception {
        if (f <= 0) {
            throw new Exception("You entered the wrong number!");
        }
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result *= i;
            Thread.sleep(1000);
        }
        return result;
    }
}
