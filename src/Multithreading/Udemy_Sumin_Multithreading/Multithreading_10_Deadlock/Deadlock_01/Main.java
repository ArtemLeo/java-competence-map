package Multithreading.Udemy_Sumin_Multithreading.Multithreading_10_Deadlock.Deadlock_01;

import Multithreading.Udemy_Sumin_Multithreading.Multithreading_10_Deadlock.Deadlock_01.Account;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(1000,1000);

        new Thread(new Runnable() {
            @Override
            public void run() {
                account.transferFrom2To1(300);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                account.transferFrom1To2(500);
            }
        }).start();
    }
}
