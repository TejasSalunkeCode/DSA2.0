import java.util.Arrays;

public class rowColMatrix {
    public static void main(String[] args) {
        int [][]arr={{10,20,30},
        {11,22,33},
        {14,24,36},
        {17,29,39}};
        // int target=24;
        // System.out.println(Arrays.toString(search(arr, 89)));
        System.out.println(Arrays.toString(search(arr, 24)));
    }
    
 static int[] search(int[][]arr,int target){
    int r=0;
    // int c=arr.length-1;
    
    int c = arr[0].length - 1;
    while (r<arr.length && c>=0) {
        if(arr[r][c]==target){
            // return  target;
            return new int[]{r,c};
        }
        if(arr[r][c]<target){
            r++;
        }else{
            c--;
        }
    }
    return new int[]{-1,-1};
 }
}








