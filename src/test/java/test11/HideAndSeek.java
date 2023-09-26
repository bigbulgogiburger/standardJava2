package test11;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class HideAndSeek {


    @Test
    void test(){
        this.hide("5 17");
    }


    private void hide(String value) {

        int answer = 0;
        int[] youAndMe =  new int[2];

        String[] s = value.split(" ");
        youAndMe[0] = Integer.parseInt(s[0]);
        youAndMe[1] = Integer.parseInt(s[1]);

        Queue<Node> q = new LinkedList<>();


        int teleported = youAndMe[0];
        while(true){
            if(teleported*2<youAndMe[1]){
                teleported *=2;
            }else{
                break;
            }
        }


        boolean[] visited = new boolean[teleported*2];

        q.add(new Node(teleported,0));

        while(!q.isEmpty()){
            Node now = q.poll();
            visited[now.current] =true;

            if(answer==0 || answer<now.time){
                answer = now.time;
            }


            if(now.current>youAndMe[1]&&!visited[now.current-1]){
                q.offer(new Node(now.current - 1, now.time + 1));
            }else{

                if(!visited[now.current-1]) {
                    q.offer(new Node(now.current - 1, now.time + 1));
                }
                if(!visited[now.current+1]) {
                    q.offer(new Node(now.current + 1, now.time + 1));
                }
                if(now.current*2< visited.length&&!visited[now.current*2]) {
                    q.offer(new Node(now.current * 2, now.time));
                }
            }
        }


    }


    class Node{
        int current;
        int time;

        public Node(int current, int time) {
            this.current = current;
            this.time = time;
        }


    }
}
