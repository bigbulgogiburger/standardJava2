package test11;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetEx4 {

    @Test
    void hashSettest4(){
        HashSet set = new HashSet<>();

        set.add(new String("abc"));
        set.add(new String("abc"));
        set.add(new Person("abc",10));
        set.add(new Person("abc",10));
        ArrayList<Object> objects = new ArrayList<>();

        System.out.println(set);
    }
}
