import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Flow26Ex {

    @Test
    void Test() {
        System.out.println("1 = " + 1);
    }

    @Test
    void FlowEx25_각자리수합더하기() {
        int num;
        int sum = 0;

        num = 123;

        while (num != 0) {

            sum += num % 10;

            num /= 10;
        }

        System.out.println("sum = " + sum);
    }

    @Test
    void FlowEx29_369() {
        for (int i = 1; i <= 333; i++) {

            String a = "";
            int value = i;
            do {
                if ((value % 10) % 3 == 0 && (value % 10) != 0) {
                    a += "짝";
                }
                value /= 10;

            } while (value != 0);
            System.out.println("i = " + i + ", " + a);
        }
    }

    @Test
    void ArrayEx8_lotto() {
        int[] balls = new int[45];
        for (int i = 0; i < balls.length; i++) {
            balls[i] = i + 1;
        }

        for (int j = 0; j < 6; j++) {
            int ranindex = (int) (Math.random() * 45);
            balls[j] = balls[ranindex];
        }

        for (int i = 0; i < 6; i++) {
            System.out.println("balls[" + i + "] = " + balls[i]);
        }
    }

    @Test
    void ArrayEx10_bubble() {
        int[] numArr = new int[10];

        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i] = (int) (Math.random() * 10));
        }
        System.out.println();

        for (int i = 0; i < numArr.length - 1; i++) {
            boolean changed = false;

            for (int j = 0; j < numArr.length - 1 - i; j++) {
                if (numArr[j + 1] < numArr[j]) {
                    int temp = 0;
                    temp = numArr[j + 1];

                    numArr[j + 1] = numArr[j];
                    numArr[j] = temp;
                    changed=true;
                }
            }
            if (!changed) break;
        }

        System.out.println("numArr = " + Arrays.toString(numArr));
    }

    @Test
    void MultiArrEx1(){

        List<String> predicatedList= Arrays.asList(new String[]{"22","33","44"});


        final int SIZE = 10;
        int[][]  map = new int[SIZE][SIZE];
        char[][] board = new char[SIZE][SIZE];
        for(int i = 0 ; i<SIZE; i++){
            for(int j = 0; j<SIZE; j++){
                map[i][j] = (int)(Math.round(Math.random()));
            }
        }

        for(int i = 0; i<SIZE;i++){
            board[0][i]=board[i][0]= (char)(i+'0');
        }
        for (int[] ints : map) {
            System.out.println(Arrays.toString(ints));
        }
        for (String s : predicatedList) {
            int x = s.charAt(0)-'0';
            int y= s.charAt(1)-'0';
            board[x][y] = map[x][y] ==1?'O':'X';

        }
        for (char[] chars : board) {
            System.out.println(Arrays.toString(chars));
        }






    }


}
