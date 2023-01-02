package Patterns.ITVDN_Patterns.Patterns_09_Decorator.decorators;

import Patterns.ITVDN_Patterns.Patterns_09_Decorator.objects.Component;

public class BorderDecorator extends Decorator {

    public BorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void afterDraw() {
        System.out.println("... add border!");
    }
}
