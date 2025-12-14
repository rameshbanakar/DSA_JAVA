import java.util.HashMap;

//finding the frequency of each number in the array
public class find_frequency_of_number {
    public static void main(String [] args){
        int arr[]={1,2,3,4,1,2,3,6,7,2,4,9,6,5,3,4,6};
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                int val=hm.get(arr[i]);
                hm.put(arr[i],val+1);
            }else{
                hm.put(arr[i],1);
            }
        }
        for(int each: hm.keySet()){
            System.out.println(each+":"+hm.get(each));
        }

    }
}
