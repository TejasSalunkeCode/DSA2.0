import java.util.Arrays;

public class leetcode_1491{
    public static void main(String[] args) {
        int []arr={48000,59000,99000,13000,78000,45000,31000,17000,39000,37000,93000,77000,33000,28000,4000,54000,67000,6000,1000,11000};
        System.out.println(addavg(arr));
    }
    static double addavg(int []arr){
        double ans=0;
        int length=arr.length-2;
        // System.out.println(length);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        double avg;
        for (int i = 1; i < arr.length-1; i++) {
              ans+=arr[i];
        }
        avg=ans/length;
        return avg;


    }
}