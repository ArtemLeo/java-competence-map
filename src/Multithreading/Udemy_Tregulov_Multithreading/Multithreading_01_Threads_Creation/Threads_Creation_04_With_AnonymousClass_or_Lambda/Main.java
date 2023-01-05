package Multithreading.Udemy_Tregulov_Multithreading.Multithreading_01_Threads_Creation.Threads_Creation_04_With_AnonymousClass_or_Lambda;

public class Main {
    public static void main(String[] args) {

        // A quick method of creating a thread using the Anonymous class;
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous Class");
            }
        }).start();

        // ... using a Lambda expression;
        new Thread(() -> System.out.println("Lambda expression")).start();
    }
}
