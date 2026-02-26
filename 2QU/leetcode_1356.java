import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class leetcode_1356 {
    public static void main(String[] args) {
        int[] arr = { 1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1 };
        int[] res = sortByBits(arr);
        System.out.println(Arrays.toString(res));
    }

    public static int[] sortByBits(int[] arr) {
        // int arr2[] = new int[arr.length];
        // int cnt = 0;
        // int k = 0;
        // HashMap<Integer, Integer> addBinary = new HashMap<>();

        // for (int i = 0; i < arr2.length; i++) {
        // boolean flag = true;
        // String num = Integer.toBinaryString(arr[i]);
        // while (flag) {
        // if (num.charAt(k) == '1') {
        // cnt++;
        // }
        // k++;
        // if (k == num.length()) {
        // flag = false;
        // }
        // }
        // k = 0;
        // addBinary.put(arr[i], cnt);
        // System.out.println(arr[i] + " -->" + cnt);
        // cnt = 0;
        // }
        // List<Map.Entry<Integer, Integer>> list = new
        // ArrayList<>(addBinary.entrySet());

        // Collections.sort(list, (a, b) -> {
        // if (a.getValue() == b.getValue())
        // return a.getKey() - b.getKey();
        // return a.getValue() - b.getValue();
        // });
        // System.out.println(addBinary);
        // int index = 0;

        // for (Map.Entry<Integer, Integer> e : list) {
        // arr[index] = e.getKey();
        // index++;
        // }

        // return arr;

        // }
        // }

        int n = arr.length;

        // Step 1: create a list of pairs (number, bitCount)
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int cnt = Integer.bitCount(arr[i]); // count 1 bits
            list.add(new int[] { arr[i], cnt });
        }
        System.out.println(Arrays.toString(list));

        // Step 2: sort the list by bitCount, tie → number
        Collections.sort(list, (a, b) -> {
            if (a[1] == b[1])
                return a[0] - b[0];
            return a[1] - b[1];
        });

        // Step 3: put sorted numbers into arr2
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = list.get(i)[0];
        }

        return arr2;
    }
}