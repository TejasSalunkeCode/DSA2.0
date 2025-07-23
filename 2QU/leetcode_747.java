import java.util.Arrays;

public class leetcode_747 {
    public static void main(String[] args) {
        int[] arr = { 0,0,0,1 };
        System.out.println(dominantIndex(arr));
    }

    static int dominantIndex(int[] nums) {

        int[] destination = new int[nums.length];

        
        // Method 1: Using loop
        for (int i = 0; i < nums.length; i++) {
            destination[i] = nums[i];
        }
        
        Arrays.sort(nums);
        int max = nums.length - 1;
        int SeconMax=nums.length-2;
        int ans=nums[SeconMax]*2;
        System.out.println(ans);
        System.out.println(nums[max]);
        System.out.println(nums[SeconMax]);
        System.out.println(Arrays.toString(nums));
        
        if(ans<nums[max] || SeconMax==0){

            for (int i = 0; i < destination.length; i++) {
                if(destination[i]==nums[max]){
                    return i;
                }
            }
        }

        return -1;
    }
}

//  for (int j = 0; j < destination.length; j++) {
//                     if(destination[i]==destination[max]){
//                         return destination[max];
//                     }
//                 }