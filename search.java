import java.lang.reflect.Array;
import java.util.Arrays;

public class search {
    public static void main(String[] args) {
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(maxArea(height));
    }

    static int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int width;
        int ans = 0;
        int Finalans = 0;
        int Finalans2 = 0;
        int Finalans3 = 0;
        int Finalans4 = 0;
        while (start < end) {
            width = end - start;
            ans = height[start] * width;
            int minHeight;
            if (height[start] < height[end]) {
                start++;
                width--;
                minHeight = Math.min(height[start], height[end]);
                System.out.println("Minimum " + minHeight);
                System.out.println("width " + width);
                // Finalans = 0;

                // System.out.println(start);
                // return start;
                Finalans = minHeight * width;
                System.out.println("final ans in 1st Block : " + Finalans);
            }
            if (height[start] > height[end]) {
                // Finalans = height[start] * width;
                // System.out.println("j");
                end--;
                width--;
                minHeight = Math.min(height[start], height[end]);
                // Finalans = 0;
                // System.out.println(start);
                // return start;
                Finalans2 = minHeight * width;
                System.out.println("final ans in 2nd Block : " + Finalans2);
            }
            if (height[start] == height[end]) {
                // Finalans = height[start] * width;
                // System.out.println("j");
                start++;
                width--;
                minHeight = Math.min(height[start], height[end]);
                // Finalans = 0;
                // System.out.println(start);
                // return start;
                Finalans3 = minHeight * width;
                System.out.println("final ans in 3rd Block : " + Finalans3);
            }
            // System.out.println(ans);
        }
        if (ans > Finalans && ans > Finalans2 && ans > Finalans3) {
            return ans;
        } else if (Finalans > ans && Finalans > Finalans2 && Finalans > Finalans3) {
                return Finalans;
            
        }else if (Finalans2 > ans && Finalans2 > Finalans && Finalans2 > Finalans3) {
                return Finalans2;
            
        }else{
            return Finalans3;
        }
        // return -1;
    }
}
