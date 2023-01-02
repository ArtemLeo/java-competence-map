package Generics.Udemy_Sumin_Generics.Generics_01_Intro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoxTest {
    @Test
    public void testBox() {
        Box<Integer> box1 = new Box<>(20);
        Box<Integer> box2 = new Box<>(10);
        int expected = 30;
        int result = box1.getObject() + box2.getObject();
        assertEquals(expected, result);

        // Приведение к типу int;
        // int result = (int) box1.getObject() + (int) box2.getObject();

        // Проверка на принадлежность к классу;
        // box2.setObject("string");
        // int n1 = 0
        // int n2 = 0
        // if (box1.getObject() instanceof Integer) {
        //    n1 = (int) box1.getObject();
        // }
        // if (box2.getObject() instanceof Integer) {
        //    n2 = (int) box2.getObject();
        // }
        // int expected = 20;
        // int result = n1 + n2

    }
}