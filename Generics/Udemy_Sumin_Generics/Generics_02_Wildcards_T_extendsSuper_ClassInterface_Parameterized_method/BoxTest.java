package Generics.Udemy_Sumin_Generics.Generics_02_Wildcards_T_extendsSuper_ClassInterface_Parameterized_method;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BoxTest {

    @Test
    public void testBox() {
        Box<Integer> box = new Box<>(5, 10, 15);
        assertEquals(10, box.avg(), 0.001);

        Box<Float> box2 = new Box<>(5f, 10f, 15f);
        assertEquals(0,box.compare(box2));

        List<Integer> number = new ArrayList<>();
        for (int i = 0; i< 10; i++){
            number.add(i);
        }
        List<Integer> number2 = new ArrayList<>();
        Box.transfer(number,number2);
        assertEquals(0,number.size());
        assertEquals(10,number2.size());
    }

    @Test
    public void testBox2() {
        List<Integer> numbers = new ArrayList<>();
        Box.method(numbers);
    }
}
