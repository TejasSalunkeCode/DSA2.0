public class Kth_element {
    public static void main(String[] args) {
        int[] a = { 2, 3, 6, 7, 9 };
        int[] b = { 1, 4, 8, 10 };
        int k = 5;

        System.out.println(kthElement(a, b, a.length, b.length, k)); // Output: 6
    }

    public static int kthElement(int[] arr, int[] arr2, int n1, int n2, int k) {
        if (n1 > n2) {
            return kthElement(arr2, arr, n2, n1, k);
        }

        int low = Math.max(k - n2, 0), high = Math.min(k, n1);
        int left = k;

        while (low <= high) {
            int mid1 = (low + high) >> 1;
            int mid2 = left - mid1;

            int l1 = Integer.MIN_VALUE, l2 = Integer.MIN_VALUE;
            int r1 = Integer.MAX_VALUE, r2 = Integer.MAX_VALUE;

            if (mid1 < n1)
                r1 = arr[mid1];
            if (mid2 < n2)
                r2 = arr2[mid2];

            if (mid1 - 1 >= 0)
                l1 = arr[mid1 - 1];
            if (mid2 - 1 >= 0)
                l2 = arr2[mid2 - 1];

            if (l1 <= r2 && l2 <= r1) {
                return Integer.max(l1, l2);
            } else if (l1 > r2) {
                high = mid1 - 1;
            } else {
                low = mid1 + 1;
            }
        }

        return 0;
    }
}
