package test11;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ArraysTest {


    @Test
    void ArrayTest(){
        List<Integer> integers = Arrays.asList(new Integer[]{1, 2, 3, 4, 5, 6});
        integers.add(11);

    }
}
