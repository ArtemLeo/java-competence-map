package Multithreading.Udemy_Tregulov_Multithreading.Multithreading_03_Methods_Sleep_Join_ThreadStates.Method_Sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            // Method sleep();
            Thread.sleep(1000);
        }
        System.out.println("Let`s go!!!");
    }
}
