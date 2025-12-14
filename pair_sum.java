import java.util.HashSet;

//finding the pair sum in the array
public class pair_sum {
    public static boolean target_sum(int arr[],int tareget){
        HashSet<Integer> hs=new HashSet<>();
        for(int each:arr){
            if(hs.contains(tareget-each)){
                return true;
            }
            hs.add(each);
        }
        return false;
    }
    public static void main(String [] args){
        int arr[]={8,9,2,-2,4,5,11,-6,4};
        int target=8;
        System.out.println(target_sum(arr,target));

    }
}
