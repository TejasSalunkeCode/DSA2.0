package Neet.Two_Pointer;

import java.util.Arrays;

public class TwoInteger {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4 };
        int target = 3;
        int[] arr = twoSum(numbers, target);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[] { numbers[i],numbers[j] };
                }
            }
        }
        return new int[]{0,0};
    }
}
