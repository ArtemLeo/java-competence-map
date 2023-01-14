package Multithreading.Udemy_Alishev_Multithreading.Multithreading_08_Class_CountDownLatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(3);

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 3; i > 0; i--) {
            executorService.submit(new Processor(countDownLatch));
            System.out.println("CountDownLatch = " + i);
            Thread.sleep(1000);
        }
        executorService.shutdown();
        countDownLatch.await();
        System.out.println("------------------------------------------------");
        System.out.println("Latch has been opened. Main thread is continues!");
    }
}

class Processor implements Runnable {
    private CountDownLatch countDownLatch;

    public Processor(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        countDownLatch.countDown();
    }
}
