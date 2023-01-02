package OOP.Udemy_Sumin_OOP.OOP_02_Classes_Objects;

public class Main {
    public static void main(String[] args) {
        Box myBox = new Box();
        myBox.height = 10.2;
        myBox.length = 15;
        myBox.width = 11.3;

        Box myBox2 = new Box();
        Box myBox3 = new Box();
        Box myBox4 = myBox3;

        myBox2.height = 5;
        myBox2.length = 5;
        myBox2.width = 5;
        myBox3.height = 10;
        myBox3.length = 10;
        myBox3.width = 10;
        myBox4.height = 20;

        double volume = myBox.height * myBox.length * myBox.width;
        double volume2 = myBox2.height * myBox2.length * myBox2.width;
        double volume3 = myBox3.height * myBox3.length * myBox3.width;
        double volume4 = myBox4.height * myBox4.length * myBox4.width;

        System.out.println("Volume myBox = " + volume);
        System.out.println("Volume myBox2 = " + volume2);
        System.out.println("Volume myBox3 = " + volume3);
        System.out.println("Volume myBox4 = " + volume4);
    }
}


