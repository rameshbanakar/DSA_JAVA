public class checK_set_unset {
    public static void main(String [] args){
        int n=21;
//      checking the ith bit is set or unset
        int i=0;
        if((n&(1<<i))==0){
            System.out.println("Unset");
        }else{
            System.out.println("Set");
        }

    }
}
