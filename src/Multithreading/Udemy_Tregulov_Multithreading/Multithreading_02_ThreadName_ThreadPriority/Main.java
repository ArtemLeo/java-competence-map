package Multithreading.Udemy_Tregulov_Multithreading.Multithreading_02_ThreadName_ThreadPriority;

public class Main implements Runnable {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        System.out.println("Name of myThread = " + myThread.getName() + ", Priority of myThread = " + myThread.getPriority());

        // Set Name and Priority (0-10) for the thread;
        myThread.setName("My Thread");
        myThread.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Name of myThread = " + myThread.getName() + ", Priority of myThread = " + myThread.getPriority());
        System.out.println("------------------------------------------");

        // Поток запускается ТОЛЬКО через Start(), через Run() запускать НЕЛЬЗЯ!;
        Thread myThread1 = new Thread(new Main());
        myThread1.start();
        System.out.println("Method Main. Thread name = " + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println("Method Run. Thread name = " + Thread.currentThread().getName());
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Hello");
    }
}
