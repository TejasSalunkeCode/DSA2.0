import java.util.Arrays;

public class leetcode_274 {
    public static void main(String[] args) {
        int[] arr = { 0, 1 };
        System.out.println(hIndex(arr));
    }

    public static int hIndex(int[] citations) {
        Arrays.sort(citations); // sort ascending
        int n = citations.length;

        for (int i = 0; i < n; i++) {
            int papers = n - i; // papers remaining
            if (citations[i] >= papers) {
                return papers;
            }
        }
        return 0;
    }
}