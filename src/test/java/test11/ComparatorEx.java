package test11;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class ComparatorEx {

    @Test
    void comparatorEx(){
        String[] strArr= {"cat","Dog","lion","tiger"};

        SortedSet<Object> objects = new TreeSet<>();
        new ArrayList<>();
        Arrays.sort(strArr);
        System.out.println("strArr = " + Arrays.toString(strArr));
        Arrays.sort(strArr,String.CASE_INSENSITIVE_ORDER);
        System.out.println("strArr = " + Arrays.toString(strArr));

        Arrays.sort(strArr, new Descending());
        System.out.println("strArr = " + Arrays.toString(strArr));


    }
}
