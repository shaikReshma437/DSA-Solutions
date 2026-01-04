import java.util.*;
public class GraphDFS {
    static void dfs(int v, boolean[] visited, int[][] g){
        visited[v]=true; System.out.print(v+" ");
        for(int i=0;i<g.length;i++){
            if(g[v][i]==1 && !visited[i]) dfs(i,visited,g);
        }
    }
    public static void main(String[] args){
        int[][] g={{0,1,0},{1,0,1},{0,1,0}};
        boolean[] visited=new boolean[g.length];
        dfs(0,visited,g);
    }
}
