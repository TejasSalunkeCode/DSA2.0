import java.util.Arrays;
public class cyclicex {
    public static void main(String[] args) {
        int []arr={3,6,7,2,1,4,5};
       cyclicc(arr);
       System.out.println(Arrays.toString(arr)); 
    }
    static void cyclicc(int[]arr){
        int i=0;
        while (i<arr.length) {
            int correctIndex=arr[i]-1;
            if(arr[i]!=arr[correctIndex]){
                swap(arr, i, correctIndex);
            }else{
                i++;
            }
        }
    }
    static void swap(int []arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}



