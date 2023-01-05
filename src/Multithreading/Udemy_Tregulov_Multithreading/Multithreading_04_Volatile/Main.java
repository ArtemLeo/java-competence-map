package Multithreading.Udemy_Tregulov_Multithreading.Multithreading_04_Volatile;

public class Main extends Thread {

    // Volatile - переменная хранится только в "main memory" (не копируется в кэш потока);
    // Применяется когда только один поток изменяет значение, а остальные потоки его читают;
    volatile boolean b = true;

    @Override
    public void run() {
        long counter = 0;
        while (b) {
            counter++;
        }
        System.out.println("Loop is finished!\nCounter = " + counter);
    }

    public static void main(String[] args) throws InterruptedException {
        Main thread = new Main();
        System.out.println("Loop is start ... ");
        System.out.println("... after 3 seconds it is time to wake up!");
        System.out.println("-------------------------------------------");
        thread.start();
        Thread.sleep(3000);
        thread.b = false;
        thread.join();
        System.out.println("End of program!");
    }
}
