package Multithreading.Udemy_Tregulov_Multithreading.Multithreading_11_Interrupting_Threads;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Main Thread starts ...");
        System.out.println("----------------------");

        InterruptedThread thread = new InterruptedThread();
        thread.start();
        Thread.sleep(2000);
        thread.interrupt();

        thread.join();
        System.out.println("----------------------");
        System.out.println("Main Thread ends!");

    }
}

class InterruptedThread extends Thread {
    double sqrtSum = 0;

    @Override
    public void run() {
        for (int i = 0; i <= 1000_000_000; i++) {
            if (isInterrupted()) {
                System.out.println("Attention!!! There is an attempt to break the thread!!!");
                System.out.println("We check our thread and decide to finish it!");
                System.out.println(sqrtSum);
                return;
            }
            sqrtSum += Math.sqrt(i);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Warning!!! There is an attempt to interrupt the thread in sleep()!!!");
                System.out.println("We check our thread and decide to finish it!");
                System.out.println(sqrtSum);
                return;
            }
        }
        System.out.println(sqrtSum);
    }
}
