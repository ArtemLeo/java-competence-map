package Multithreading.Udemy_Sumin_Multithreading.Multithreading_10_Deadlock.Deadlock_02;

public class MFP {

    private final Object printMonitor = new Object();
    private final Object scanMonitor = new Object();

    public void scan(int count) {
        synchronized (scanMonitor) {
            for (int i = 0; i < count; i++) {
                try {
                    Thread.sleep(500);
                    System.out.println("Scanned " + i + " pages!");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public void print(int count) {
        synchronized (printMonitor) {
            for (int i = 0; i < count; i++) {
                try {
                    Thread.sleep(500);
                    System.out.println("Printed " + i + " pages!");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
