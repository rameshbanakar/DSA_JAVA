import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bfs_graph {
    public static void bfs(ArrayList<ArrayList<Integer>> graph,int node,boolean visited[]){
        Queue<Integer> q=new LinkedList<>();
        visited[node]=true;
        q.add(node);
        while(!q.isEmpty()){
            int rem=q.remove();
            System.out.println(rem);
            for(int nei:graph.get(rem)){
                if(!visited[nei]){
                    q.add(nei);
                    visited[nei]=true;
                }
            }
        }
    }
    public static void main(String [] args){
        int edges[][] = {{1, 2}, {2, 3}, {3, 4}, {4, 1}};
        int nodes = 4;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= nodes; i++) {
            graph.add(new ArrayList<>());
        }
        for (int j = 0; j < edges.length; j++) {
            int start = edges[j][0];
            int end = edges[j][1];
            graph.get(start).add(end);
            graph.get(end).add(start);

        }
        boolean visited []=new boolean[nodes+1];

        for(int i=1;i<nodes+1;i++){
            if(!visited[i]){
                bfs(graph,i,visited);
            }
        }

    }
}
