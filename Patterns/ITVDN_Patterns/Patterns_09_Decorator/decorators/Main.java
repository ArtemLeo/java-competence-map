package Patterns.ITVDN_Patterns.Patterns_09_Decorator.decorators;

import Patterns.ITVDN_Patterns.Patterns_09_Decorator.objects.Component;
import Patterns.ITVDN_Patterns.Patterns_09_Decorator.objects.Window;

public class Main {
    public static void main(String[] args) {
        Component windowWithBorder = new BorderDecorator(new Window());
        windowWithBorder.draw();
        System.out.println("--------------------------");

        Component windowWithColor = new ColorDecorator(new Window());
        windowWithColor.draw();
        System.out.println("--------------------------");

        Component windowWithBorderAndColor = new ColorDecorator(new BorderDecorator(new Window()));
        windowWithBorderAndColor.draw();
    }
}
