public class agressive_cows {
    public static boolean check_possible(int arr[],int min,int k){
        int cur=arr[0];
        int cows=1;
        for(int i=0;i<arr.length;i++){

            if(arr[i]-cur>min){
                cur=arr[i];
                cows++;
            }
            if(cows==k) return true;
        }
        return false;

    }
    public static int minDist(int arr[],int cows){
        int n=arr.length;
        int low=1;
        int high=arr[n-1]-arr[0];
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(check_possible(arr,mid,cows)){
                ans=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }

        }
        return ans;
    }
    public static void main(String []args){
        int arr[]={2,6,11,14,19,25,30,39,43};
        int dist=minDist(arr,4);
        System.out.println(dist);

    }
}
