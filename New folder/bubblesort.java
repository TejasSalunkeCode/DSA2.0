import java.util.Arrays;

public class bubblesort {
  public static void main(String[] args) {
    int []arr={10,9,11,14,2};
    bubble(arr);
    System.out.println(Arrays.toString(arr));

}
static int bubble(int[]arr){
      boolean swapped;
    for (int i = 0; i < arr.length; i++) {
        swapped=false;
        for(int j=1;j<arr.length-i;j++){

            
            // if(arr[j]>arr[j+1]){
            //     int temp;
            //     temp=arr[j];
            //     arr[j]=arr[j+1];
            //     arr[j+1]=temp;
            //     // System.out.println("hello");
            // }

            if(arr[j]<arr[j-1]){
                int temp;
                temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                // System.out.println("hello");
                swapped=true;
            }
        }
        if(!swapped){
            System.out.println("hello");
            break;
        }
    }
  

    return -1;
  }
}
