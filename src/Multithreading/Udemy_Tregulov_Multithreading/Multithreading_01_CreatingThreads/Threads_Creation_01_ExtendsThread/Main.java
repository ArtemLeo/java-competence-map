package Multithreading.Udemy_Tregulov_Multithreading.Multithreading_01_CreatingThreads.Threads_Creation_01_ExtendsThread;

public class Main {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();
        myThread1.start();
        myThread2.start();

        // Параллельный запуск одного и того же потока MyThread1 (myThread1 + myThread3);
        MyThread1 myThread3 = new MyThread1();
        // myThread1.start(); ... Started earlier
        myThread3.start();
    }
}

class MyThread1 extends Thread {
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println(i);
        }
    }
}

class MyThread2 extends Thread {
    public void run() {
        for (int i = 1000; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
