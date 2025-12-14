public class gcd {
    public static int gcd_find(int a,int b){
        if(b==0) return a;
        return gcd_find(b,a%b);
    }
    public static void main(String[] args){
        System.out.println(gcd_find(10,5));

//      finding the GCD for the array list
        int [] arr={1,2,3,4,4,5,6,6,7,8};
        int ans=arr[0];
        for(int i=1;i<arr.length;i++){
            ans=gcd_find(ans,arr[i]);
        }
        System.out.println(ans);
    }
}
