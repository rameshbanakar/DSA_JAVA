//finding the factorial of the number
public class factorial_num {
//   this is using the recursion
    public static int factorial(int n){
        if(n==1) return 1;
        return n*factorial(n-1);
    }
//  this is using the loop
    public static int fact(int n){
        int ans=1;
        for(int i=1;i<=n;i++){
            ans*=i;
        }
        return ans;
    }
    public static void main(String [] args){
        int n=10;
        System.out.println(factorial(n));
        System.out.println(fact(n));
    }
}
