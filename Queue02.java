import java.util.LinkedList;
import java.util.Queue;
public class CircularQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for(int i=1;i<=5;i++) q.add(i);
        while(!q.isEmpty()) System.out.print(q.remove()+" ");
    }
}
