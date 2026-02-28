package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class leetcode_16 {
    public static void main(String[] args) {
        int[] nums = { -1, 2, 1, -4 };
        int target = 1;
        System.out.println(threeSumClosest(nums, target));
    }

    public static int threeSumClosest(int[] nums, int target) {
        int sum = Integer.MAX_VALUE;
        List<Integer> list = new ArrayList<>();
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int j2 = j + 1; j2 < nums.length; j2++) {
                    sum = nums[i] + nums[j] + nums[j2];
                    if (sum >= target) {
                        list.add(sum);
                        k++;
                    }
                    System.out.println(sum);
                }
            }
        }
        Collections.sort(list);
        return list.get(0);
    }
}
