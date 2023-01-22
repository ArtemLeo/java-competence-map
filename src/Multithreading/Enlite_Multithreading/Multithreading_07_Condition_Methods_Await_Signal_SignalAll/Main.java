package Multithreading.Enlite_Multithreading.Multithreading_07_Condition_Methods_Await_Signal_SignalAll;

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
                account.deposit(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    static class MyWithdrawal extends Thread {
        @Override
        public void run() {
            try {
                account.withdraw(700);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    static class Account {
        Lock lock = new ReentrantLock();
        Condition newCondition = lock.newCondition();
        int balance = 0;

        public void deposit(int amount) throws InterruptedException {
            lock.lock();
            Thread.sleep(1000);
            balance += amount;
            System.out.println("Balance is increased = " + balance);
            newCondition.signalAll();
            lock.unlock();
        }

        public void withdraw(int amount) throws InterruptedException {
            lock.lock();
            while (amount > balance) {
                newCondition.await();
            }
            System.out.println("Balance before withdrawal = " + balance);
            balance -= amount;
            System.out.println("Balance after withdrawal = " + balance);
            lock.unlock();
        }
    }
}




