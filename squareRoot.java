public class squareRoot {

    public static int findSquareroot(int num){
        if(num==0 || num==1) return num;
        int l=1;
        int h=num;
        int ans=0;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(mid*mid==num) return mid;
            else if(mid*mid>num){
                h=mid-1;
            }else{
                l=mid+1;
                ans=mid;
            }
        }
        return ans;
    }

    public static int firstOccurance(int [] arr,int target){
        if(arr.length==1 && arr[0]==target) return 0;
        int l=0;
        int h=arr.length-1;
        int ans=0;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid]<target){
                l=mid+1;

            }else if(arr[mid]>target){
                h=mid+1;
            }else{
                ans=mid;
                h=mid-1;
            }
        }
        return ans;

    }

    public static int lastOccuracne(int arr[],int target){
        if(arr.length==1 && arr[0]==target) return 0;

        int n=arr.length;
        int l=0;
        int h=n;
        int ans=0;
        while(l<=h){
            int m=l+(h-l)/2;
            if(arr[m]<target){
                l=m+1;
            }else if(arr[m]>target){
                h=m-1;
            }else{
                ans=m;
                l=m+1;
            }
        }
        return ans;
    }

    public static void main(String [] args){
        System.out.println("Square Root of the given number:"+findSquareroot(23));

        int [] arr={1,2,2,2,3,3,3,3,3,5,5,5,5,7,8,8,8,8,8};
        int index=firstOccurance(arr,2);
        System.out.println("First occurance of the arr: "+index);

        int last=lastOccuracne(arr,5);
        System.out.println("Last occurance:"+last);
    }
}
