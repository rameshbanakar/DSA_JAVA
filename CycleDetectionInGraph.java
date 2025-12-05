import java.util.*;

public class CycleDetectionInGraph {
    public static boolean cycleDetectInDirectedGraph(ArrayList<ArrayList<Integer>> graph,int node,ArrayList<Integer> pathFound,boolean visted[]){
        visted[node]=true;
        pathFound.add(node);
        for(int nei:graph.get(node)){
            if(pathFound.contains(nei)) return true;
            if(!visted[nei]){
                if(cycleDetectInDirectedGraph(graph,nei,pathFound,visted)){
                    return true;
                }
            }
        }
        pathFound.remove(node);
        return false;
    }
    public static void main(String []args) {
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

        }
//        System.out.println(graph);
        ArrayList<Integer> pathFound=new ArrayList<>();
        boolean visited[] = new boolean[nodes + 1];

        boolean cycle=false;
        for(int j=1;j<=nodes;j++){
            if(!visited[j]){
                cycle=cycleDetectInDirectedGraph(graph,j,pathFound,visited);
            }
        }
        System.out.println(cycle);

    }
}
