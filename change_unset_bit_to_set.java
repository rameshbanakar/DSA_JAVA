//if the ith bit is unset make it to the set and if it is already set no change
public class change_unset_bit_to_set {
    public static void main(String [] args){
        int n=100;
        int i=4;
        if((n&(1<<i))==0){
            n=n^(1<<i);
        }
        System.out.println(n);
    }
}
