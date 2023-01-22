package Multithreading.Udemy_Sumin_Multithreading.Multithreading_04_Synchronized.Synchronized_02;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM(1000);

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                atm.withdraw("Max", 300);
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                // thread1.join();
                atm.withdraw("John", 500);
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                // thread2.join();
                atm.withdraw("Nick", 400);
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
