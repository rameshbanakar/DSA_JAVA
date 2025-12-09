import java.util.Arrays;
//Given an array of size n and Q queries given (s,v) add element v to all indexes from s to n-1 once all queries are done
//return the final array
public class adding_ele {
    public static int [] adding_val(int [] ans,int [][] queries){
        for(int i=0;i<queries.length;i++){
            int start=queries[i][0];
            int value=queries[i][1];
            ans[start]+=value;
        }
        int prefixSum[]=new int[ans.length];
        prefixSum[0]=ans[0];
        for(int i=1;i<ans.length;i++){
            prefixSum[i]=prefixSum[i-1]+ans[i];
        }
        return prefixSum;
    }
    public static void main(String [] args){
        int []a=new int [6];
        int [][] queries={{2,10},{0,-1},{3,2},{4,4},{3,3}};
        int []ans=adding_val(a,queries);
        System.out.println(Arrays.toString(ans));
    }
}
