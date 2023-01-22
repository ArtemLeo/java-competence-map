package Multithreading.Udemy_Alishev_Multithreading.Multithreading_13_Callable_Future;

import java.util.Random;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<Integer> future = executorService.submit(() -> {
            System.out.println("Thread starting ...");
            Thread.sleep(500);
            System.out.println("Thread finished!");

            Random random = new Random();
            int randomValue = random.nextInt(10);
            if (randomValue < 5) {
                throw new Exception("We throw an Exception because randomValue < 5");
            } else {
                return randomValue;
            }
        });
        executorService.shutdown();
        try {
            // Method get() waits for the thread to complete;
            int result = future.get();
            System.out.println(result);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            Throwable throwable = e.getCause();
            System.out.println(throwable.getMessage());
        }
    }
}

