import java.util.HashMap;
//finding the count of the pair sum
public class count_pair_sum {
    public static int count_target_sum(int[] arr,int target){
         int count=0;
         HashMap<Integer,Integer> hm=new HashMap<>();
         for(int i=0;i<arr.length;i++){
             int ele=arr[i];
             if(hm.containsKey(target-ele)){
                 count+=hm.get(target-ele);
             }
             if(hm.containsKey(ele)){
                 int val=hm.get(ele);
                 hm.put(ele,val+1);
             }else{
                 hm.put(ele,1);
             }
         }
         return count;

    }
    public static void main(String [] args){
        int arr[]={8,9,2,-2,4,5,11,-6,4,0};
        int target=11;
        System.out.println(count_target_sum(arr,target));
    }
}
