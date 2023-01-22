package Multithreading.Udemy_Sumin_Multithreading.Multithreading_12_Semapfore_CyclicBarrier.Semapfore_CyclicBarrier_03;

import java.util.Map;
import java.util.concurrent.*;

public class Main {
    private static final int CARS_COUNT_IN_TUNNEL = 3;
    private static final int CARS_COUNT = 10;
    private static final Semaphore tunnelSemaphore = new Semaphore(CARS_COUNT_IN_TUNNEL);
    private static final ExecutorService executorService = Executors.newCachedThreadPool();
    private static final CyclicBarrier cyclicBarrier = new CyclicBarrier(CARS_COUNT);
    private static final Map<Integer, Long> score = new ConcurrentHashMap<>();
    private static final CountDownLatch countDownLatch = new CountDownLatch(CARS_COUNT);
    private static int winnerIndex = -1;

    private static final Object monitor = new Object();

    public static void main(String[] args) {
        for (int i = 0; i < CARS_COUNT; i++) {
            final int index = i;
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    prepare(index);
                    try {
                        cyclicBarrier.await();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    } catch (BrokenBarrierException e) {
                        throw new RuntimeException(e);
                    }
                    long before = System.currentTimeMillis();
                    roadFirst(index);
                    tunnel(index);
                    roadSecond(index);
                    synchronized (monitor) {
                        if (winnerIndex == -1) {
                            winnerIndex = index;
                        }
                    }
                    long after = System.currentTimeMillis();
                    score.put(index, after - before);
                    countDownLatch.countDown();
                }
            });
        }

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        for (int key : score.keySet()) {
            System.out.println("Car " + key + " = " + score.get(key) + " millis");
        }

        System.out.println("------------------------------------");
        System.out.println("Winner: " + winnerIndex + " Time: " + score.get(winnerIndex));
        executorService.shutdown();
    }

    private static void sleepRandomTime() {
        long millis = (long) (Math.random() * 5000 + 1000);
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static void prepare(int index) {
        System.out.println("Car " + index + " started preparing ...");
        sleepRandomTime();
        System.out.println("Car " + index + " finished preparing!");
    }

    private static void roadFirst(int index) {
        System.out.println("Car " + index + " started roadFirst ...");
        sleepRandomTime();
        System.out.println("Car " + index + " finished roadFirst!");
    }

    private static void roadSecond(int index) {
        System.out.println("Car " + index + " started roadSecond ...");
        sleepRandomTime();
        System.out.println("Car " + index + " finished roadSecond!");
    }

    private static void tunnel(int index) {
        try {
            tunnelSemaphore.acquire();
            System.out.println("Car " + index + " started tunnel ...");
            sleepRandomTime();
            System.out.println("Car " + index + " finished tunnel!");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            tunnelSemaphore.release();
        }
    }
}
