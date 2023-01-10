package Multithreading.Udemy_Tregulov_Multithreading.Multithreading_14_Synchronizer_Semaphore;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);
        new Person("Tom", callBox);
        new Person("John", callBox);
        new Person("Ben", callBox);
        new Person("Anna", callBox);
        new Person("Zoe", callBox);
    }
}

class Person extends Thread {
    String name;
    private final Semaphore callBox;

    public Person(String name, Semaphore callBox) {
        this.name = name;
        this.callBox = callBox;
        this.start();
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " WAITS for ...");
            callBox.acquire();
            System.out.println(name + " USES the callBox!");
            sleep(2000);
            System.out.println(name + " COMPLETED the call!");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            callBox.release();
        }
    }
}