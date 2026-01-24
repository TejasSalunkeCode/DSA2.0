// import java.util.Arrays;

// public class alternate_num {
//     public static void main(String[] args) {
//         int[]arr={1,2,-4,-5,-7};
//         System.out.println(alternateNumber(arr));
//     }

//     public static int[] alternateNumber(int[] arr) {
//         int n = arr.length;
//         int[] pos = new int[n];
//         int[] neg = new int[n];

//         int k = 0, j = 0;

//         for (int i = 0; i < n; i++) {
//             if (arr[i] > 0) {
//                 pos[k] = arr[i];
//                 k++;
//             } else {
//                 neg[j] = arr[i];
//                 j++;
//             }
//         }

//         if(pos.length>neg.length){
//             for (int i = 0; i < neg.length; i++) {
//                 arr[2*i]=pos[i];
//                 arr[2*i+1]=neg[i];
//             }
//             int index=neg.length*2;
//             for (int i = neg.length; i < pos.length; i++) {
//                 arr[index]=pos[i];
//                 index++;
//             }
//         }
//         else{
//              for (int i = 0; i < pos.length; i++) {
//                 arr[2*i]=pos[i];
//                 arr[2*i+1]=neg[i];
//             }
//             int index=pos.length*2;
//             for (int i = pos.length; i < neg.length; i++) {
//                 arr[index]=pos[i];
//                 index++;
//             }
//         }
//         System.out.println(Arrays.toString(arr));
//         return arr;
//     }

// }


import java.util.Arrays;

public class AlternateNumbers {
    public static int[] alternateNumber(int[] arr) {
        int n = arr.length;
        int[] pos = new int[n];
        int[] neg = new int[n];

        int p = 0, q = 0;

        // separate positives and negatives
        for (int x : arr) {
            if (x > 0) pos[p++] = x;
            else neg[q++] = x;
        }

        int[] ans = new int[n];
        int i = 0, idx = 0;

        // alternate till one finishes
        while (i < p && i < q) {
            ans[idx++] = pos[i];
            ans[idx++] = neg[i];
            i++;
        }

        // append leftovers
        while (i < p) ans[idx++] = pos[i++];
        while (i < q) ans[idx++] = neg[i++];

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, -4, -5, -7};
        System.out.println(Arrays.toString(alternateNumber(arr)));
    }
}
