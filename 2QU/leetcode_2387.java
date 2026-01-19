public class leetcode_2387 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 3, 5},
            {2, 6, 9},
            {3, 6, 9}
        };

        int r = matrix.length;
        int c = matrix[0].length;

        System.out.println("Median is: " + findMedian(matrix, r, c));
    }

    public static int findMedian(int[][]matrix,int r,int c){
        int low=1, high = 1000000000;

        while (low<=high) {
            int mid=(low+high)/2;
            int count=0;

            for (int i = 0; i < r; i++) {
                count+=upperBound(matrix[i], mid);
            }

            if(count<=(r*c)/2){
                low=mid+1;
            }else{
                high=mid-1;
            }s
        }
        return low;
    }

    public static int upperBound(int[] row, int target) {
        int low=0,high=row.length;

        while (low<high) {
            int mid=(low+high)/2;
            if(row[mid]<=target){
                low=mid+1;
            }else{
                high=mid;
            }
        }
        return low;
    }

}
