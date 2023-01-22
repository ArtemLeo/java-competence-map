package Multithreading.Enlite_Multithreading.Multithreading_08_Synchronized_Methods_Wait_Notify_NotifyAll;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    static Account account = new Account();

    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyDeposit());
        Thread thread2 = new Thread(new MyWithdrawal());
        thread1.start();
        thread2.start();
    }

    static class MyDeposit extends Thread {
        @Override
        public void run() {
            try {
                account.deposit(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    static class MyWithdrawal extends Thread {
        @Override
        public void run() {
            try {
                account.withdraw(800);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    static class Account {
        int balance = 0;

        public synchronized void deposit(int amount) throws InterruptedException {
            Thread.sleep(1000);
            balance += amount;
            notify();
            System.out.println("Balance is increased = " + balance);
        }

        public synchronized void withdraw(int amount) throws InterruptedException {
            while (amount > balance) {
                wait();
            }
            System.out.println("Balance before withdrawal = " + balance);
            balance -= amount;
            System.out.println("Balance after withdrawal = " + balance);
        }
    }
}
