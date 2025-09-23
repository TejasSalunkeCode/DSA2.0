import java.util.Arrays;

public class leetcode_165 {
    public static void main(String[] args) {
        String version1 = "1.01", version2 = "1.001";
        System.out.println(compareVersion(version1, version2));

    }

    static int compareVersion(String version1, String version2) {
        int point1 = 0;
        int point2 = 0;
        int length1 = 0;
        int length2 = 0;

        for (int i = 0; i < version1.length(); i++) {
            if (version1.charAt(i) == '.') {
                version1.replace(".", "");
                point1++;
            } else {
                length1++;
            }
        }
        System.out.println(version1);

        for (int i = 0; i < version2.length(); i++) {
            if (version2.charAt(i) == '.') {
                point2++;
            } else {
                length2++;
            }
        }
        if (point1 != point2) {
            return 0;
        }

        int[] arr1 = new int[length1];
        int[] arr2 = new int[length2];
        System.out.println(arr1.length + "length");

        int idx = 0;

        for (int i = 0; i < version1.length(); i++) {
            if (version1.charAt(i) != '.') {
                arr1[idx++] = version1.charAt(i) - '0';
            }
        }
        idx = 0;

        for (int i = 0; i < version2.length(); i++) {
            if (version2.charAt(i) != '.') {
                arr2[idx++] = version2.charAt(i) - '0';
            }
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        int max = Math.min(length1, length2);

        for (int i = 0; i < max; i++) {
            if (arr1[i] > arr2[i]) {
                return 1;
            }
            if (arr1[i] < arr2[i]) {
                return -1;
            }
            // if (arr1[i] == arr2[i] && i == max - 1) {
            //     return 1;
            // }
        }

        return 0;
    }
}
