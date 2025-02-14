import java.util.Arrays;

public class duplicate {
 
    public static void main(String[] args) {
        int []arr={1,3,4,2,2};
       cyclicc(arr);
       System.out.println(Arrays.toString(arr)); 
    }
    static int cyclicc(int[]arr){
        int i=0;
        System.out.println("hel");
        while (i<arr.length) {
            int correctIndex=arr[i]-1;
            if(arr[i]!=arr[correctIndex]){
                swap(arr, i, correctIndex);
                if(arr[correctIndex]==arr[i+1]){
                    return arr[i+1];
                }
                else{
                    System.out.println("hello");
                i++;
            }
        }
        // for (int j = 0; j < arr.length; j++) {
            //     if(arr[j]==arr[j+1]){
                //         return arr[j];
                //     }
                // }
            }
        return -1;
    }
    static void swap(int []arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }   
}
