package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bfs {
   public ArrayList<Integer> bfsOfGraph(int v,ArrayList<ArrayList<Integer>> adj){
    ArrayList<Integer> bfs = new ArrayList<>();
    boolean visi[] = new boolean[v];
    Queue<Integer> q = new LinkedList<>();

    q.add(0);
    visi[0]=true;

    while (!q.isEmpty()) {
        Integer node = q.poll();
        bfs.add(node);

        for(Integer it : adj.get(node)){
            if(visi[it]==false){
                visi[it]=true;
                q.add(it);
            }
        }
    }
    return bfs;
   }  
}
