package Annotations.Udemy_Alishev_Annotations.Annotations_02_Creating_Annotations;

@MethodInfo(author = "Anna", dateOfCreation = 2018, purpose = "Print Hello World")
public class Main {

    @MethodInfo(author = "Den", dateOfCreation = 2019, purpose = "Print Hello World")
    public void printHelloWorld() {
        System.out.println("Hello world!");
    }
}
