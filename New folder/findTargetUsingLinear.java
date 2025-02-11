// package BinaryIn2d;

public class findTargetUsingLinear {
    public static void main(String[] args) {
        int [][]arr={{10,20,30},
        {11,22,33},
        {14,24,36},
        {17,29,39}};
        int target=24;
        System.out.println(search(arr, target));
    }

 static int search(int[][]arr,int target){

    for(int i=0;i<arr.length;i++){
        for(int j=0;j<i;j++){
            if(arr[i][j]==target){
                return arr[i][j];
            }
        }
    }
    return -1;
 }
}
