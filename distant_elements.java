import java.util.HashSet;

//finding the number of distant elements in the array
public class distant_elements {
    public static void main(String [] args){
        int arr[]={1,2,3,4,1,2,3,6,7,2,4,9,6,5,3,4,6};
        HashSet<Integer> hs=new HashSet<>();
        for(int each:arr){
            hs.add(each);
        }
        System.out.println(hs.size());
    }
}
