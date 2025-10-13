package Neet.Two_Pointer;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum {

    public static void main(String[] args) {
        int[] num = { -1, 0, 1, 2, -1, -4 };
        List<List<Integer>> result = threeSum(num);

        // Print the result
        System.out.println(result);
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> listOfList = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> first = new ArrayList<>();
                        first.add(nums[i]);
                        first.add(nums[j]);
                        first.add(nums[k]);
                        listOfList.add(first);
                    }
                    // first.clear();
                }
            }
        }
        return listOfList;
    }

}
