package Multithreading.Udemy_Tregulov_Multithreading.Multithreading_09_Lock_ReentrantLock.Lock_ReentrantLock_02;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        new Employee("Tom", lock);
        new Employee("Anna", lock);
        new Employee("John", lock);
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
            System.out.println(name + " waiting ...");
            lock.lock();
            System.out.println(name + " uses an ATM!");
            Thread.sleep(2000);
            System.out.println(name + " stopped using an ATM!");
            System.out.println("----------------------------");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }

        // Method tryLock (if-else);
        if (lock.tryLock())
            try {
                System.out.println(name + " again uses an ATM!");
                Thread.sleep(2000);
                System.out.println(name + " again stopped using an ATM!");
                System.out.println("----------------------------");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        else {
            System.out.println(name + " won't wait for the ATM to become free!");
            System.out.println("----------------------------");
        }
    }
}
