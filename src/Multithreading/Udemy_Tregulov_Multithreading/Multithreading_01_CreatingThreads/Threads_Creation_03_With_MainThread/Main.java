package Multithreading.Udemy_Tregulov_Multithreading.Multithreading_01_CreatingThreads.Threads_Creation_03_With_MainThread;

public class Main extends Thread implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Main());
        thread1.start();
        for (int i = 1000; i > 0; i--) {
            System.out.println(i);
        }
    }
}
