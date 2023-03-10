package Multithreading.Udemy_Sumin_Multithreading.Multithreading_03_DaemonThreads_DataRace.DaemonThreads_01;

public class Main {
    private static final int SIZE = 10_000_000;
    private static final int HALF = SIZE / 2;

    public static void main(String[] args) throws InterruptedException {
        startTimer();
        withConcurrency();
        withoutConcurrency();
    }

    private static void startTimer() {
        Thread timer = new Thread(new Runnable() {
            @Override
            public void run() {
                int seconds = 0;
                System.out.println("Timer starting ... ");
                try {
                    while (true) {
                        System.out.println(seconds++);
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        timer.setDaemon(true);
        timer.start();

    }

    private static void withoutConcurrency() {
        float[] array = new float[SIZE];
        for (int i = 0; i < SIZE; i++) {
            array[i] = 1f;
        }
        long before = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            float f = (float) i;
            array[i] = (float) (array[i] * Math.sin(0.2f + f / 5) * Math.cos(0.2 + f / 5) * Math.cos(0.4f + f / 2));
        }
        long after = System.currentTimeMillis();
        System.out.println("WithoutConcurrency = " + (after - before) + " millis");
    }

    private static void withConcurrency() throws InterruptedException {
        float[] array = new float[SIZE];
        for (int i = 0; i < SIZE; i++) {
            array[i] = 1f;
        }
        long before = System.currentTimeMillis();
        float[] firstHalf = new float[HALF];
        float[] secondHalf = new float[HALF];
        System.arraycopy(array, 0, firstHalf, 0, HALF);
        System.arraycopy(array, HALF, secondHalf, 0, HALF);

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < firstHalf.length; i++) {
                    float f = (float) i;
                    firstHalf[i] = (float) (firstHalf[i] * Math.sin(0.2f + f / 5) * Math.cos(0.2 + f / 5) * Math.cos(0.4f + f / 2));
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < secondHalf.length; i++) {
                    float f = (float) (i + HALF);
                    secondHalf[i] = (float) (secondHalf[i] * Math.sin(0.2f + f / 5) * Math.cos(0.2 + f / 5) * Math.cos(0.4f + f / 2));
                }
            }
        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.arraycopy(firstHalf, 0, array, 0, HALF);
        System.arraycopy(secondHalf, 0, array, HALF, HALF);

        long after = System.currentTimeMillis();
        System.out.println("WithConcurrency = " + (after - before) + " millis");
    }
}
