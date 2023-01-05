package Multithreading.Udemy_Tregulov_Multithreading.Multithreading_09_Lock_ReentrantLock.Lock_ReentrantLock_02;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        new Employee("Tom", lock);
        new Employee("Zoe", lock);
        new Employee("Den", lock);
        new Employee("Anna", lock);
        new Employee("Eva", lock);
    }
}

class Employee extends Thread {
    String name;
    private final Lock lock;

    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " waiting...");
            lock.lock();
            System.out.println(name + " uses an ATM");
            Thread.sleep(2000);
            System.out.println(name + " stopped using an ATM");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }

        // Method tryLock ( if -else)");

        if (lock.tryLock())
            try {
                System.out.println(name + " uses an ATM");
                Thread.sleep(2000);
                System.out.println(name + " stopped using an ATM");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        else {
            System.out.println(name + "will not wait until the ATM is free");
        }
    }
}
