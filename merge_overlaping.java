import java.util.ArrayList;
import java.util.Arrays;

public class merge_overlaping {
     public static void main(String [] args){
         int intervals[][]={{0,2},{1,4},{5,6},{6,8},{7,10},{8,9},{12,14}};
         ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
         int start=intervals[0][0];
         int end=intervals[0][1];
         for(int i=1;i<intervals.length;i++){
             if(end>=intervals[i][0]){
                 start=Math.min(start,intervals[i][0]);
                 end=Math.max(end,intervals[i][1]);
             }else{
                 ans.add(new ArrayList<>(Arrays.asList(start,end)));
                 start=intervals[i][0];
                 end=intervals[i][1];
             }
         }
         ans.add(new ArrayList<>(Arrays.asList(start,end)));
         System.out.println(ans);
     }
}
