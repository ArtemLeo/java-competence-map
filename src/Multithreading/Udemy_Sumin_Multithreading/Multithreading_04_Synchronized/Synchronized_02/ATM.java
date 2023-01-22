package Multithreading.Udemy_Sumin_Multithreading.Multithreading_04_Synchronized.Synchronized_02;

public class ATM {
    private int amount;
    private final Object monitor = new Object();

    public ATM(int amount) {
        this.amount = amount;
    }

    public void withdraw(String name, int amount) {
        synchronized (monitor) {
            System.out.println(name + " went to the ATM ...");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            if (amount <= this.amount) {
                this.amount -= amount;
                System.out.println(name + " withdrew " + amount);
                System.out.println("Left: " + this.amount);
                System.out.println("---------------------");
            } else {
                System.out.println("There is not enough money in the account for " + name + "!");
            }
        }
    }
}
