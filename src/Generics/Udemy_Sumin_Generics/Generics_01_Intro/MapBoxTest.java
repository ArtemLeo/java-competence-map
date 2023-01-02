package Generics.Udemy_Sumin_Generics.Generics_01_Intro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MapBoxTest {
    @Test
    public void testBox() {
        MapBox<String, Integer> box1 = new MapBox<>("String", 15);
        MapBox<String, Integer> box2 = new MapBox<>("String", 15);
        int result = box1.getValue() + box2.getValue();
        assertEquals(30, result, 1);
    }
}