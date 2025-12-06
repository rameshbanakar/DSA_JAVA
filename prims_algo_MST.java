import java.util.ArrayList;
import java.util.PriorityQueue;

class NodePair {
    int node;
    int distance;

    NodePair(int node, int distance) {
        this.node = node;
        this.distance = distance;
    }
}

public class prims_algo_MST {

//  minimum spaning tree using the prims algorithms
    public static int minimum_spaning_tree(ArrayList<ArrayList<NodePair>> graph,int node,boolean visited[]){
        PriorityQueue<NodePair> pq=new PriorityQueue<>((a,b)->Integer.compare(a.distance,b.distance));
        pq.add(new NodePair(node,0));
        int ans=0;

        while(!pq.isEmpty()){
            NodePair rem=pq.remove();
            int dist=rem.distance;
            int val=rem.node;
            if(visited[val]) continue;
            visited[val]=true;
            ans+=dist;
            for(NodePair nei:graph.get(val)){
                if(visited[nei.node]==false){
                    pq.add(nei);
                }
            }
            System.out.println(ans);
        }
        return ans;

    }

    public static void main(String [] args){
        int edges[][] = {{0,1,2}, {0,3,6}, {1,2,3}, {1,3,8},{1,4,5},{2,4,7},{3,4,9}};
        int nodes = 5;
        ArrayList<ArrayList<NodePair>> graph = new ArrayList<>();
        for (int i = 0; i <= nodes; i++) {
            graph.add(new ArrayList<>());
        }
        for (int j = 0; j < edges.length; j++) {
            int start = edges[j][0];
            int end = edges[j][1];
            int dist=edges[j][2];
            graph.get(start).add(new NodePair(end,dist));
            graph.get(end).add(new NodePair(start,dist));
        }
        boolean visited[]=new boolean[nodes+1];

        int answer=minimum_spaning_tree(graph,0,visited);

        System.out.println("Minimun spaning tree:"+answer);
    }
}
