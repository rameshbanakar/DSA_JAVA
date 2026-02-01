public class painterPart {

    public static boolean check_possible(int arr[],int minTime,int k){
        int time=arr[0];
        int painters=1;
        for(int i=0;i<arr.length;i++){
            time+=arr[i];
            if(time>minTime){
                time=arr[i];
                painters++;
            }
        }
        return painters<=k;
    }

    public static int painters(int arr[],int k){
        int low=0;
        int high=0;
        for(int i=0;i<arr.length;i++){
            low=Math.max(low,arr[i]);
            high+=arr[i];
        }
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(check_possible(arr,mid,k)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;

    }

    public static void main(String [] args){
        int number_painer=4;
        int boards[]={3,5,1,7,8,2,5,3,10,1,4,7,5,4,6};
        int minTime=painters(boards,number_painer);
        System.out.println("Number min time required required:"+minTime);

    }
}
