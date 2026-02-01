//Problem Statement
//
//You are given Q queries.
//Each query contains three integers L, R, and X.
//
//For every query, determine how many numbers in the range [L, R] (inclusive)
// have the X-th bit set to 1 in their binary representation.

public class bit_count_chekcing_in_queries {
    public static int count(int n,int x){
        int block=1<<x;
        int half=1<<x-1;
        int fullblock=n/block;
        int count=fullblock*half;
        int rem=n%block;
        if(rem>=half){
            count+=rem-half+1;
        }
        return count;
    }
    public static int solve(int l,int r,int x){
        return count(r,x)-count(l-1,x);
    }
    public static void main(String args[]){
        int q[]={1,10,2};
        int ans=solve(q[0],q[1],q[2]);
        System.out.println(ans);
    }
}
