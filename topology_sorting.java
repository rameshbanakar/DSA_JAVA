import java.util.*;

public class topology_sorting{
    public static void khans_algo( ArrayList<ArrayList<Integer>> graph){
        int indegree[]=new int[graph.size()];
        for(int i=0;i<graph.size();i++){
            for(int nbr:graph.get(i)){
                indegree[nbr]++;
            }
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<indegree.length;i++){
            if(indegree[i]==0) q.add(i);
        }
        while(!q.isEmpty()){
            int node=q.remove();
            System.out.println(node);
            for(int each:graph.get(node)){
                indegree[each]--;
                if(indegree[each]==0) q.add(each);
            }
        }
    }

    public static void main(String[] args) {
        int edges[][] = {{0, 1}, {0, 2}, {1, 3},{2, 3}, {3, 4}};
        int nodes = 4;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < nodes + 1; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < edges.length; i++) {
            int node = edges[i][0];
            int end = edges[i][1];
            graph.get(node).add(end);
        }
        khans_algo(graph);
    }
}