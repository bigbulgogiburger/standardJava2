package test11;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

public class GameMap {

    @Test
    void test(){
        int[][] maps =
            {{1,0,1,1,1}
            ,{1,0,1,0,1}
            ,{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
        int answer= this.solution(maps);
        System.out.println("answer = " + answer);

    }



    public int solution(int[][] maps) {


        boolean[][] visited = new boolean[maps.length][maps[0].length];
        int answer = 0;


        Queue<Node> q = new LinkedList<>();
        q.add(new Node(0,0,1));
        visited[0][0] = true;


        while(!q.isEmpty()){
            Node spot = q.poll();

            if(spot.x== maps.length-1&& spot.y == maps[0].length-1){
                answer = spot.edge;
                break;
            }

            for(int i =0;i<4;i++){

                switch (i){
                    case 0:
                        if(spot.x+1< maps.length && maps[spot.x+1][spot.y]==1 && !visited[spot.x+1][spot.y]){
                            q.add(new Node(spot.x+1,spot.y,spot.edge+1));
                            visited[spot.x+1][spot.y] = true;
                            break;
                        }
                    case 1:
                        if(spot.x-1>=0 && maps[spot.x-1][spot.y]==1 && !visited[spot.x-1][spot.y]){
                            q.add(new Node(spot.x-1,spot.y,spot.edge+1));
                            visited[spot.x-1][spot.y] = true;
                            break;
                        }
                    case 2:
                        if(spot.y+1< maps[0].length && maps[spot.x][spot.y+1]==1 && !visited[spot.x][spot.y+1]){
                            q.add(new Node(spot.x,spot.y+1,spot.edge+1));
                            visited[spot.x][spot.y+1] =true;
                            break;
                        }
                    case 3:
                        if(spot.y-1>=0 && maps[spot.x][spot.y-1]==1 && !visited[spot.x][spot.y-1]){
                            q.add(new Node(spot.x,spot.y-1,spot.edge+1));
                            visited[spot.x][spot.y-1] =true;
                            break;
                        }

                }
            }

        }

        return answer;
    }

    private



    static class Node{

        int x;
        int y;
        int edge;

        public Node(int x, int y, int edge) {
            this.x = x;
            this.y = y;
            this.edge = edge;
        }
    }
}
