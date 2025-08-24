import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class testing {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 0, 1, 1, 1, 0, 1 };
        System.out.println(longestSubarray(arr));
    }

    static int longestSubarray(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int max1 = 0;
        int max2 = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                max1++;
                continue;
            }
        }
        // System.out.println(max1);
        if (max1 == nums.length) {
            return nums.length - 1;
        }
        max1 = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i] != 0 && nums[i] == 1 && nums[j] == 1) {
                    list.add(nums[j]);
                } else {
                    count++;
                    // System.out.println("cccc "+count);
                    // count=0;
                    break;
                }
                count = 0;
            }
            if(list.size()==0){
                count++;
            System.out.println("cc"+count);
            }
            if (max1 == 0) {
                max1 = list.size();
                System.out.println(max1);

                // continue;
            } else if (max2 == 0) {
                max2 = list.size();
                System.out.println(max2);

            } else {
                if (list.size() >= max1) {
                    max1 = list.size();
                    System.out.println(max1);

                } else if (list.size() >= max2) {
                    max2 = list.size();
                    System.out.println(max2);

                } 

            }

            // System.out.println(max2);
            // if(max1>)
            System.out.println(list);
            list.clear();
        }
        return max1 + max2;
    }
}