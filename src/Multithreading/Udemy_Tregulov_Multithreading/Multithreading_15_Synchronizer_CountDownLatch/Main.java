package Multithreading.Udemy_Tregulov_Multithreading.Multithreading_15_Synchronizer_CountDownLatch;

import java.util.concurrent.CountDownLatch;

public class Main {
    static CountDownLatch countDownLatch = new CountDownLatch(3);

    private static void marketStaffIsOnPlace() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Market staff came to work!");
        countDownLatch.countDown();
        System.out.println("countDownLatch = " + countDownLatch.getCount());
        System.out.println("--------------------------");
    }

    private static void everythingIsReady() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Everything is ready, so let`s open market!");
        countDownLatch.countDown();
        System.out.println("countDownLatch = " + countDownLatch.getCount());
        System.out.println("--------------------------");
    }

    private static void openMarket() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("Market is opened!");
        countDownLatch.countDown();
        System.out.println("countDownLatch = " + countDownLatch.getCount());
        System.out.println("--------------------------");
    }

    public static void main(String[] args) throws InterruptedException {
        new Friend("Tom", countDownLatch);
        new Friend("John", countDownLatch);
        new Friend("Anna", countDownLatch);
        new Friend("Den", countDownLatch);
        new Friend("Zoe", countDownLatch);

        marketStaffIsOnPlace();
        everythingIsReady();
        openMarket();
        Thread.sleep(1000);
    }
}

class Friend extends Thread {
    String name;
    private CountDownLatch countDownLatch;

    public Friend(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
        this.start();
    }

    @Override
    public void run() {
        try {
            countDownLatch.await();
            Thread.sleep(1000);
            System.out.println(name + " started shopping!");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
