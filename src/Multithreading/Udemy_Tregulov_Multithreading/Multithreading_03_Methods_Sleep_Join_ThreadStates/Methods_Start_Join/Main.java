package Multithreading.Udemy_Tregulov_Multithreading.Multithreading_03_Methods_Sleep_Join_ThreadStates.Methods_Start_Join;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Method Main begins ... ");
        Thread thread = new Thread(new Worker());

        System.out.println(thread.getState()); // Состояние потока NEW (BEFORE calling START() method);
        thread.start();
        System.out.println(thread.getState()); // Состояние потока RUNNABLE (AFTER calling START() method);
        thread.join();
        System.out.println(thread.getState()); // Состояние потока TERMINATED (AFTER "thread" has finished his work);
        System.out.println("Method Main ends!");
    }
}

class Worker implements Runnable {
    @Override
    public void run() {
        System.out.println("Work begins ...");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Work ends!");
    }
}
