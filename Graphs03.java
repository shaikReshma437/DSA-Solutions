import java.util.*;
public class GraphBFS {
    public static void main(String[] args){
        int[][] g={{0,1,0},{1,0,1},{0,1,0}};
        boolean[] visited=new boolean[g.length];
        Queue<Integer> q=new LinkedList<>();
        q.add(0); visited[0]=true;
        while(!q.isEmpty()){
            int v=q.remove(); System.out.print(v+" ");
            for(int i=0;i<g.length;i++){
                if(g[v][i]==1 && !visited[i]){
                    q.add(i); visited[i]=true;
                }
            }
        }
    }
}
