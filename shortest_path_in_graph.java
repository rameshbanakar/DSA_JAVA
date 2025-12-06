
//there are N number od nodes and multi source {s1,s2,s3} find the length of the shortest path for the given destination
// to any one of the source

import java.util.*;
class pair{
    int node;
    int distance;
    int parent;
    pair(int node,int dist,int par){
        this.node=node;
        this.distance=dist;
        this.parent=par;
    }
}
public class shortest_path_in_graph {
    public static void shortest_path(ArrayList<ArrayList<Integer>> graph,ArrayList<Integer> source,boolean[] visited,int target){
        Queue<pair> q=new LinkedList<>();
        for(int each:source){
            q.add(new pair(each,0,each));
            visited[each]=true;
        }
        while(!q.isEmpty()){
            pair rem=q.remove();
            if(rem.node==target){
                System.out.println("shortest path:"+rem.distance+" with the parent node "+rem.parent);
                return;
            }else{
                for(int each:graph.get(rem.node)){
                    if(visited[each]==false){
                        q.add(new pair(each, rem.distance+1, rem.parent));
                        visited[each]=true;
                    }
                }
            }
        }
        System.out.println("No path found for the destinations");
        return;
    }

    public static void main(String [] args){
        int edges[][] = {{1, 11}, {11, 6}, {11, 5}, {5, 2},{5,4},{2,3},{3,12},{3,9},{9,13},{13,10},{10,7},{7,8},{8,4}};
        int nodes = 13;
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
        boolean visited[]=new boolean[nodes+1];
        ArrayList<Integer> source=new ArrayList<>(Arrays.asList(11,2,7));
        int target=9;
        shortest_path(graph,source,visited,target);
    }

}
