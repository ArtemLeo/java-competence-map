package Multithreading.Udemy_Alishev_Multithreading.Multithreading_02_Volatile;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Volatile. Cache Coherency;
        MyThread myThread = new MyThread();
        myThread.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        myThread.shutdown();
    }
}


class MyThread extends Thread {
    private boolean running = true;

    @Override
    public void run() {
        while (running) {
            System.out.println("Hello!");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void shutdown() {
        this.running = false;
    }
}
