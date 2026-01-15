import java.util.Arrays;

public class leetcode_1283 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 5, 9 };
        int threshold = 6;
        System.out.println(smallestDivisor(nums, threshold));
    }

    public static int sumByD(int[]arr,int div){
        int sum=0;
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            sum += Math.ceil((double) arr[i] / (double) div);
        }
        return sum;
    }

    public static int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high=Arrays.stream(nums).max().getAsInt();
        System.out.println(high);

        while (low<=high) {
            int mid=(low+high)/2;

            if(sumByD(nums, mid)<=threshold){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
}
