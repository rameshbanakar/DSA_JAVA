public class unique_number_of_3 {
    public static int squareNumber(int n){
        if (n==1 || n==0) return n;
        int l=1;
        int h=n/2;

        int ans=0;
        while(l<=h){
            int m=l+(h-l)/2;
            if(m*m==n){
                return m;
            }
            else if(m*m<=n){
                ans=m;
                l=m+1;
            }else{
                h=m-1;
            }
        }
        return ans;
    }
    public static void main(String [] args){
        System.out.println(squareNumber(12000));
    }
}
