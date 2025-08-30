package _55_Binary_Tree_Ques;

public class leetcode_367 {
    public static void main(String[] args) {
        int a=16;
        System.out.println(isPerfectSquare(a));
    }
    static boolean isPerfectSquare(int num) {
        
        if (num < 2) return true; 

        long left = 2, right = num / 2; 
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;

            if (square == num) return true;
            else if (square < num) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }
}

