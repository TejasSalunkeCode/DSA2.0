import java.util.Arrays;

public class leetcode_1089 {
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,5,0};
        duplicateZeros(arr);
    }

    public static void duplicateZeros(int[] arr) {
        int[]arr2=new int[arr.length];
        boolean flag=true;
        int k=0;
        for (int i = 0; i < arr2.length; i++) {
            if(arr[i]!=0){
                arr2[k]=arr[i];
            }else{
                arr2[k]=0;
                if(k+1<arr.length){
                    k++;
                    arr2[k]=0;
                }
            }

            
            System.out.println(Arrays.toString(arr2));
            k++;
            if(k==arr2.length){
                break;
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            arr[i]=arr2[i];
        }
        System.out.println("hell");
        System.out.println(Arrays.toString(arr));

    }
}
