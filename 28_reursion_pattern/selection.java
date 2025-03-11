import java.util.Arrays;

public class selection {
    public static void main(String[] args) {
        int[] arr={9,6,0,4,2,1,5};
        selectionn(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionn(int[] arr,int r,int c,int max){
        if(r==0){
            return;
        }

        
        if(c<r){
            if(arr[c]>arr[max]){
                selectionn(arr, r, c+1, c);
            }else{
                selectionn(arr, r, c+1, max);
            }
        }
        else{
            int temp=arr[max];
            arr[max]=arr[r-1];
            arr[r-1]=temp;
            selectionn(arr, r-1, 0, 0);
        }
    }
}
