package test11;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Network {

    @Test
    void test(){
        int n = 3;
        int[][] computers = {{1, 1, 0}, {1, 1, 1}, {0, 1, 1}};
        System.out.println("answer  = " + this.solution(n,computers));
    };

    public int solution(int n, int[][] computers) {

        int answer = 0;
        boolean visited[][] = new boolean[n][n];


        Stack<Node> st = new Stack<>();


        for(int k = 0; k<computers.length;k++){
            if(!visited[k][k]) {
                st.push(new Node(0));
                visited[k][k] = true;
                while (!st.isEmpty()) {
                    Node node = st.pop();

                    for (int i = 0; i < computers.length; i++) {
                        if (computers[node.computer][i] == 1 &&
                                !visited[node.computer][i]) {
                            visited[node.computer][i] = true;
                            st.push(new Node(i));
                        }
                    }
                }
                answer++;
            }
        }

        return answer;
    }
    static class Node{
        int computer;
//        int level;

        public Node(int computerA) {
            this.computer = computerA;
        }
    }
}
