import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int []arr={6,4,1,9,-5,34,-69,3};
        insertionn(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void insertionn(int []arr){
        for (int i = 0; i < arr.length-1; i++) {
            for(int j=i+1;j>0;j--){
                System.out.println("hello");
                if(arr[j]<arr[j-1]){
                    // swap(arr, i, j-1);
                    swap(arr, j, j-1);
                }
                else{
                    break;
                }
            }
        }
    }
    static void swap(int[]arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

}
