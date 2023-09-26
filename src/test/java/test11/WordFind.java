package test11;


import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

public class WordFind {



    @Test
    void test(){
        String begin = "hit";
        String target = "cog";
        String[] words = {"hot", "dot", "dog", "lot", "log"};
        int answer = this.solution(begin,target,words);
        System.out.println("answer = " + answer);
    }

    public int solution(String begin, String target, String[] words) {
        int answer=0;
        int n= words.length;
        Queue<Node> q = new LinkedList<>();

        boolean visited[] = new boolean[n];
        q.add(new Node(begin,0));

        while(!q.isEmpty()){
            Node word = q.poll();
            if(word.word.equals(target)){
                answer= word.edge;
                System.out.println("word = " + word.word);
                break;
            }
            for(int i =0 ; i< words.length; i++){
                if(!visited[i]&&isConvertable(word.word,words[i])){
                    q.add(new Node(words[i],word.edge+1));
                    visited[i] =true;
                }
            }


        }


        return answer;
    }

    private boolean isConvertable(String word, String target) {
        int count = 0;
        for(int i =0; i<word.length();i++){
            if(target.charAt(i)!=word.charAt(i)){
                count++;
            }
        }
        if(count==2){
            return true;
        }else{
            return false;
        }

    }


    static class Node {
        private String word;
        private int edge;

        public Node(String word, int edge) {
            this.word = word;
            this.edge = edge;
        }
    }
}
