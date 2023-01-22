package Multithreading.Enlite_Multithreading.Multithreading_04_Synchronized;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread thread1 = new Thread(myThread);
        Thread thread2 = new Thread(myThread);

        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("x = " + myThread.getX());
    }
}

class MyThread extends Thread {
    int x = 0;

    @Override
    public synchronized void run() {
        for (int i = 0; i < 10000; i++) {
            x++;
        }
    }

    public int getX() {
        return x;
    }
}