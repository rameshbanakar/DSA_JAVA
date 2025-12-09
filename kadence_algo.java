// kadence algo will be used to find the maximum sub array sum
public class kadence_algo {
    public static int maximumSubArraySum(int arr[]){
        int ans=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(sum+arr[i]<0){
                sum=arr[i];
            }else{
                sum+=arr[i];
            }
            ans=Math.max(ans,sum);
        }
        return ans;
    }

    public static void main(String [] args){
        int arr[]={-1,-2,-3,-4,-4,-2};
        System.out.println(maximumSubArraySum(arr));
    }
}
