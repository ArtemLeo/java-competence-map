package Multithreading.Udemy_Sumin_Multithreading.Multithreading_10_Deadlock.Deadlock_02;

public class Main {
    private final static Object MONITOR = new Object();

    public static void main(String[] args) {
        MFP mfp = new MFP();

        Thread threadPrint = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (MONITOR) {
                    mfp.print(10);
                }
            }
        });

        Thread threadScan = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (MONITOR) {
                    mfp.scan(10);
                }
            }
        });

        threadScan.start();
        threadPrint.start();
        try {
            threadScan.join();
            threadPrint.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("--------------------------------");
        System.out.println("Printing and scanning completed!");
    }
}
