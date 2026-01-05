public class unique_number {
//  finding the unique number using the XOR operator
    public static int unique_number_find(int arr[]){
        int ans=arr[0];
        for(int i=1;i<arr.length;i++){
            ans^=arr[i];
        }
        return ans;
    }
    public static void main(String [] args){
        int arr[]={1,2,3,4,5,1,2,3,4};
        System.out.println(unique_number_find(arr));
    }
}
