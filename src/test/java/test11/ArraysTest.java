package test11;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ArraysTest {


    @Test
    void ArrayTest(){

        HashSet m = new HashSet<>();

        for(int i = 0; i<17 ; i++){
            m.add(i);
            m.add(i+1005);
            m.add(i+99999);
        }

        System.out.println(m);

    }
}
