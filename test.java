import java.util.Scanner;
public class test {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i=sc.nextInt();
        if((n&(1<<i))==0){
            System.out.println("unset");
        }else{
            System.out.println(n^(1<<i));
        }
    }
}
