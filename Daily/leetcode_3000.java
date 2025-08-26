public class leetcode_3000 {
    public static void main(String[] args) {
        int[][] dimensions = { { 3, 5 }, { 4, 3 } };
        System.out.println(areaOfMaxDiagonal(dimensions));
    }

    static int areaOfMaxDiagonal(int[][] dimensions) {
        
        int maxDiagonalSq = 0; 
        int maxArea = 0;

        for (int[] rect : dimensions) {
            int l = rect[0];
            int w = rect[1];
            int diagSq = l * l + w * w;
            int area = l * w;
            if (diagSq > maxDiagonalSq || (diagSq == maxDiagonalSq && area > maxArea)) {
                maxDiagonalSq = diagSq;
                maxArea = area;
            }
        }


        return maxArea;
    }
}