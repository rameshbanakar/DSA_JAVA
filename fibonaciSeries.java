public class fibonaciSeries {
//    fibonaci using the two varibales
    public static void fibUsingTwoVaribales(int n){
        if(n==0){
            System.out.println(0);
            return;
        };
        if(n==1){
            System.out.println(1);
            return;
        };
        int a=0;
        int b=1;
        int c=a+b;
        System.out.print(a+" "+b+" ");
        while(c<=n){
            System.out.print(c+" ");
            a=b;
            b=c;
            c=a+b;
        }

    }



    public static void main(String [] args){
         int n=5;
        fibUsingTwoVaribales(n);

    }

}
