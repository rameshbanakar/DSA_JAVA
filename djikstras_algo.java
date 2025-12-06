//finding the shortest path from source to each node

import java.util.*;
class GraphPair{
    int node;
    int distance;
    GraphPair(int node,int distance){
        this.distance=distance;
        this.node=node;
    }
}
public class djikstras_algo {
    public static void djikshtrasAlgo(ArrayList<ArrayList<GraphPair>> graph,int start,int distance[]){
        PriorityQueue<GraphPair> pq=new PriorityQueue<>((a,b)->Integer.compare(a.distance,b.distance));

        pq.add(new GraphPair(start,0));
        while(!pq.isEmpty()){
            GraphPair rem=pq.remove();
            int node=rem.node;
            int dist=rem.distance;
            if(distance[node]!=Integer.MAX_VALUE) continue;
            distance[node]=dist;
            for(GraphPair each:graph.get(node)){
                if(distance[each.node]==Integer.MAX_VALUE){
                   pq.add(new GraphPair(each.node, each.distance+dist));
                }
            }
        }

    }
    public static void main(String [] args){
        int nodes = 5;
        int start = 0;

        int edges[][] = {
                {0,1,4},
                {0,2,1},
                {2,1,2},
                {1,3,1},
                {2,3,5},
                {3,4,3},
                {1,4,6}
        };

        ArrayList<ArrayList<GraphPair>> graph=new ArrayList<>();
        for (int i = 0; i < nodes; i++) {
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int s=edges[i][0];
            int e=edges[i][1];
            int w=edges[i][2];
            graph.get(s).add(new GraphPair(e,w));
            graph.get(e).add(new GraphPair(s,w));
        }

        int distance[]=new int[nodes];
        Arrays.fill(distance,Integer.MAX_VALUE);

        djikshtrasAlgo(graph,start,distance);
        System.out.println(Arrays.toString(distance));
    }

}
