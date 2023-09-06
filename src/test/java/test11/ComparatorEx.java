package test11;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ComparatorEx {

    @Test
    void comparatorEx(){
        String[] strArr= {"cat","Dog","lion","tiger"};

        Arrays.sort(strArr);
        System.out.println("strArr = " + Arrays.toString(strArr));
        Arrays.sort(strArr,String.CASE_INSENSITIVE_ORDER);
        System.out.println("strArr = " + Arrays.toString(strArr));

        Arrays.sort(strArr, new Descending());
        System.out.println("strArr = " + Arrays.toString(strArr));


    }
}
