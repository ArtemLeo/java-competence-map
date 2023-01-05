package Multithreading.Udemy_Tregulov_Multithreading.Multithreading_03_Methods_Sleep_Join_ThreadStates.Method_Join;

public class Main extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRunnable1());  // Поток от интерфейса;
        Main thread2 = new Main();                       // Поток от класса;
        System.out.println(thread1.getName());           // Thread-0
        System.out.println(thread2.getName());           // Thread-1

        // start() -> Main thread DOES NOT wait for other threads to finish work;
        thread1.start();
        thread2.start();
        System.out.println("End with start()!");

        // join() -> Main thread is WAITING for the other threads to finish their work;
        thread1.join();
        thread2.join();
        System.out.println("End with join()!");
    }

}

class MyRunnable1 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
