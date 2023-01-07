package Multithreading.Udemy_Tregulov_Multithreading.Multithreading_10_DaemonThreads;

public class Main {
    public static void main(String[] args) {

        System.out.println("Thread Main starts ...");
        System.out.println("----------------------");

        UserThread userThread = new UserThread();
        userThread.setName("UserThread");

        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setName("DaemonThread");
        daemonThread.setDaemon(true);

        userThread.start();
        daemonThread.start();

        System.out.println("Thread Main ends!");
        System.out.println("----------------------");
    }
}

class UserThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is daemon? - " + isDaemon());
        for (char i = 'A'; i <= 'W'; i++) {
            try {
                sleep(300);
                System.out.println(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class DaemonThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is daemon? - " + isDaemon());
        for (int i = 1; i <= 1000; i++) {
            try {
                sleep(100);
                System.out.println(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
