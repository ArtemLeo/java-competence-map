package Primitives_BasicStructures.Udemy_Alishev_Primitives_BasicStructures;

public class Primitives_02_Variables_Primitive_DataTypes {
    public static void main(String[] args) {
        byte myByte = 7;             // 8 bit:  -128 ... 127;
        short myShort = 45;          // 16 bit: -32 768 ... 32 768;
        int myInt = 243;             // 32 bit: - 2 147 483 648 ... 2 147 483 648;
        long myLong = 424424;        // 64 bit: - 9 223 372 036 854 775 808 ... 9 223 372 036 854 775 808;

        float myFloat = 4.9383f;     // 32 bit;
        double myDouble = 7.48384;   // 64 bit;

        char myChar = 'a';           // 16 bit:  0 ... 65 535;
        boolean myBoolean = true;    //          true ... false;

        System.out.println("myByte = " + myByte);
        System.out.println("myShort = " + myShort);
        System.out.println("myInt = " + myInt);
        System.out.println("myLong = " + myLong);
        System.out.println("myFloat = " + myFloat);
        System.out.println("myDouble = " + myDouble);
        System.out.println("myChar = " + myChar);
        System.out.println("myBoolean = " + myBoolean);
    }
}
