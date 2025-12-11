// searching an element in the 2D sorted array
public class searching_in_2D_sorted_array {
    public static void main(String [] args){
        int [][] arr={{-5,-2,1,13},{-4,0,3,14},{-3,2,5,18},{2,6,10,20}};

        int i=0;
        int j=arr[0].length-1;
        int target=10;
        boolean found=false;
        while(i>=0 && i<arr.length && j>=0){
            if(arr[i][j]==target){
                found=true;
                break;
            }else if(arr[i][j]>target){
                j--;
            }else{
                i++;
            }
        }
        if(found){
            System.out.println("found");
        }else{
            System.out.println("Not found ");
        }

    }
}
