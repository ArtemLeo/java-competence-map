package Patterns.ITVDN_Patterns.Patterns_09_Decorator.decorators;

import Patterns.ITVDN_Patterns.Patterns_09_Decorator.objects.Component;

public abstract class Decorator implements Component {
    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    public abstract void afterDraw();

    public void draw() {
        component.draw();
        afterDraw();
    }
}
