
import java.util.ArrayList;
import java.util.List;
public class SetMismatch 
    {
      public static void main(String[] args) {
        int []arr={4,6,6,2,1,4,5};
  
    System.out.println(cyclicc(arr));
    }
    static int cyclicc(int[]arr){
        int i=0;
        while (i<arr.length) {
            int correctIndex=arr[i]-1;
            if(arr[i]!=arr[correctIndex]){
                swap(arr, i, correctIndex);
            }else{
                i++;
            }
        }

        // List<Integer> ans=new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if(arr[index]!=index+1){
            // return  index+1;
            return  arr[index];
            // return new int[] {arr[index],index+1};
            }
        }
        // return new int[] {-1,-1};
        return -1;

    }
    static void swap(int []arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
