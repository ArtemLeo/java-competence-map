package Multithreading.Udemy_Sumin_Multithreading.Multithreading_02_InterruptingThreads_SystemCurrentTimeMillis.Interrupting_Threads_01;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start ...");

        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 20; i++) {
                    Thread.currentThread().isInterrupted();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("\nThread was interrupted!");
                        break;
                    }
                    System.out.print(i + " ");
                }
            }

        });
        myThread.start();

        // Main Thread loop;
        for (int i = 0; i < 20; i++) {
            if (i == 10) {
                myThread.interrupt();
                break;
            }
            Thread.sleep(1000);
        }

        myThread.join();
        System.out.println("\nFinish!");
    }
}


