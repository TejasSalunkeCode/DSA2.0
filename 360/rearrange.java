import java.util.Arrays;

// package 360;

public class rearrange {
    public static void main(String[] args) {
        int[] arr= { 3, 8, 1, 4};
        int m = 6;
        System.out.println(rearrangeArray(arr, m));
    }

     static int[] rearrangeArray(int[] arr, int m) {
        int []arr2=new int[arr.length];
        int k=0;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]>m){
                    arr2[k]=arr[i]-m;
                    k++;
                }else if(arr[i]<m){
                    arr2[k]=m-arr[i];
                    k++;
                }
            }
            System.out.println(Arrays.toString(arr2));
        return arr;
    }
}
 

