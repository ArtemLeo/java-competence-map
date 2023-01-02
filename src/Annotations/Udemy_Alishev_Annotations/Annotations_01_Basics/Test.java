package Annotations.Udemy_Alishev_Annotations.Annotations_01_Basics;

public class Test {
    public static void main(String[] args) {
        // @Override
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("Hello from main thread");
        System.out.println("------------------------------");

        // @Deprecated
        MyClass myClass = new MyClass();
        myClass.myMethod();

    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hello from MyThread");
    }
}