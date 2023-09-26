package test11;

import org.junit.jupiter.api.Test;

import java.util.*;

public class MissileDefence {


    @Test
    void test(){
        int[][] targets = {{4,5},{4,8},{10,14},{11,13},{5,12},{2,7},{1,4}};
        int answer = solution(targets);
        System.out.println("answer = " + answer);
    }



    public int solution(int[][] targets) {

        int answer = 0;
        Arrays.sort(targets, Comparator.comparingInt(o -> o[1]));

        int end = 0;

        for(int i =0 ; i< targets.length;i++){

            if(targets[i][0]>=end){
                System.out.println("targets[i] = " + targets[i][0]);
                answer++;
                end = targets[i][1];
            }
        }
        return answer;
    }

}
