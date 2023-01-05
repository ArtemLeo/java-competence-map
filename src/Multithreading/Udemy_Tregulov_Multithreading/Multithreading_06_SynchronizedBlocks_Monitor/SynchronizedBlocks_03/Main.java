package Multithreading.Udemy_Tregulov_Multithreading.Multithreading_06_SynchronizedBlocks_Monitor.SynchronizedBlocks_03;

public class Main {
    static final Object lock = new Object();

    void mobileCall() {
        synchronized (lock) {
            System.out.println("Mobile call starts ...");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Mobile call ends!");
            System.out.println("------------------");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    void skypeCall() {
        synchronized (lock) {
            System.out.println("Skype call starts ...");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Skype call ends!");
            System.out.println("------------------");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    void whatsAppCall() {
        synchronized (lock) {
            System.out.println("WhatsApp call starts ...");
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("WhatsApp call ends!");
            System.out.println("------------------");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableMobile());
        Thread thread2 = new Thread(new RunnableSkype());
        Thread thread3 = new Thread(new RunnableWhatsApp());
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class RunnableMobile implements Runnable {

    @Override
    public void run() {
        new Main().mobileCall();
    }
}

class RunnableSkype implements Runnable {

    @Override
    public void run() {
        new Main().skypeCall();
    }
}

class RunnableWhatsApp implements Runnable {

    @Override
    public void run() {
        new Main().whatsAppCall();
    }
}
