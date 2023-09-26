package test11;

import org.junit.jupiter.api.Test;

public class Divide {


    @Test
    void test(){
        String quest = "1 3";
        int[] numbers = new int[2];

        String[] a = quest.split(" ");

        for(int i = 0; i<a.length; i++){
            numbers[i] = Integer.parseInt(a[i]);
        }

        System.out.println((double)numbers[0]/numbers[1]);
    }

}
