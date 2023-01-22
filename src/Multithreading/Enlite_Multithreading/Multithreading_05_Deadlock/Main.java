package Multithreading.Enlite_Multithreading.Multithreading_05_Deadlock;

public class Main {
    public static void main(String[] args) {
        String a = "ABC";
        String b = "DEF";


        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (a) {
                    System.out.println("A -> is synchronized from Thread");
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    synchronized (b) {
                        System.out.println("B -> is synchronized from Thread");
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (b) {
                    System.out.println("B -> is synchronized from Thread");
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    synchronized (a) {
                        System.out.println("A -> is synchronized from Thread");
                    }
                }
            }
        }).start();
    }
}
