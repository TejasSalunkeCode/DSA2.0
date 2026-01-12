package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Pair {
    int first;
    int second;

    Pair(int f, int s) {
        first = f;
        second = s;
    }
}

public class leetcode_graph {

    public boolean checkforCycle(int sr, ArrayList<ArrayList<Integer>> adj, boolean[] vis) {
        vis[sr] = true;   // fixed src → sr

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(sr, -1));

        while (!q.isEmpty()) {
            Pair p = q.poll();
            int node = p.first;
            int parent = p.second;

            for (int adjacentNode : adj.get(node)) {
                if (!vis[adjacentNode]) {
                    vis[adjacentNode] = true;
                    q.add(new Pair(adjacentNode, node));
                } 
                else if (adjacentNode != parent) {
                    return true;   // cycle found
                }
            }
        }
        return false;
    }

    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                if (checkforCycle(i, adj, vis)) {
                    return true;
                }
            }
        }
        return false;
    }
}
