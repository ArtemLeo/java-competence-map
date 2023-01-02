package Patterns.ITVDN_Patterns.Patterns_09_Decorator.objects;

public class TextView implements Component {

    @Override
    public void draw() {
        System.out.println("Draw text view!");
    }
}
