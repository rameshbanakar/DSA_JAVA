public class missing_natural_number {
    public static int natiral_number_miss(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                arr[i]=n+2;
            }
        }
        for(int i=0;i<n;i++){
            int ele=Math.abs(arr[i]);
            if(ele>=1 && ele<=n){
                if(arr[ele-1]>0){
                    arr[ele-1]=arr[ele-1]*-1;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]>0) return i+1;
        }
        return n+1;
    }
    public static void main(String [] args){
        int arr[]={5,3,1,-1,-2,-3,7,2};
        System.out.println(natiral_number_miss(arr));
    }
}
