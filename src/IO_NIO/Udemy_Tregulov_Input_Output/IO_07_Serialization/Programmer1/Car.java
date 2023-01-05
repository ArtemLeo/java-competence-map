package IO_NIO.Udemy_Tregulov_Input_Output.IO_07_Serialization.Programmer1;

import java.io.Serializable;

public class Car implements Serializable {
    String model;
    String color;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
