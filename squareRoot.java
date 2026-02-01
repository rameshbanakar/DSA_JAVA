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
    public static void main(String [] args){
        System.out.println(findSquareroot(23));
    }
}
