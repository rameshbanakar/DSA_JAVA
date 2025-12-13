//given a array of elements with the each element repeated twice expect two elements so now we need to find those two
// unique elements
public class find_two_unique_numbers {
    public static void main(String [] args){
        int arr[]={1,2,3,4,1,2,3,4,5,6};
        int xor=0;
        for(int i=0;i<arr.length;i++){
            xor=xor^arr[i];
        }

        int bit=0;
        for(int i=0;i<32;i++){
            if((xor&(1<<i))!=0){
                break;
            }
            bit++;
        }
        int setNum=0;
        int unSetNum=0;
        for(int each:arr){
            if((each&(1<<bit))==0){
                unSetNum^=each;
            }else{
                setNum^=each;
            }
        }
        System.out.println(setNum);
        System.out.println(unSetNum);
    }

}
