package test11;

import org.junit.jupiter.api.Test;

import java.util.Stack;

public class SumOfArrays {



    @Test
    void test(){
        int[] sequence = {1,2,3,4,5};
        int k = 7;

        int[] answer = this.solution(sequence,k);
    }

    public int[] solution(int[] sequence, int k) {
        int[] answer =null;


        Stack<Node> s = new Stack<>();
        s.push(new Node(k,0,0));


        while(!s.isEmpty()){
            Node element = s.pop();

            if(element.additional-sequence[element.end]==0){
                if(answer ==null){
                    answer = new int[]{element.start, element.end};
                }else{
                    if((sequence[answer[1]]-sequence[answer[0]])>
                            (sequence[element.start]-sequence[element.end])){
                        answer = new int[]{element.start, element.end};
                    }

                }
                if(element.start+1<sequence.length){
                    s.push(new Node(k,element.start+1, element.start+1));
                }

            }else {

            }

        }

        return answer;
    }

    static class Node{
        int additional;
        int start;
        int end;

        public Node(int additional, int start, int end) {
            this.additional = additional;
            this.start = start;
            this.end = end;
        }
    }


}
