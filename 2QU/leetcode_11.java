import java.lang.reflect.Array;
import java.util.Arrays;
public class leetcode_11 {
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("Maximum water container area: " + maxArea(height));
    }

    static int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int maxArea = 0;

        while (start < end) {
            int width = end - start;
            int minHeight = Math.min(height[start], height[end]);
            int area = minHeight * width;
            maxArea = Math.max(maxArea, area);

            // Move the pointer pointing to the shorter line
            if (height[start] < height[end]) {
                start++;
            } else {
                end--;
            }
        }

        return maxArea;
    }
}
