//finding the total sum of the all the sub matrix
public class Sub_matrix_sum {
    public static void main(String [] args){
        int [][] mat={{4,9,6},{5,-1,2}};
        int sum=0;
        int m=mat.length;
        int n=mat[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int tl=(i+1)*(j+1);
                int bl=(m-i)*(n-j);
                int sub=tl*bl;
                sum+=sub*mat[i][j];
            }
        }
        System.out.println(sum);
    }
}
