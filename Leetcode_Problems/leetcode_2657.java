import java.util.Arrays;

public class leetcode_2657 {
    public static void main(String[] args) {
        int A[] = { 1, 3, 2, 4 };
        int[] B = { 3, 1, 2, 4 };
        System.out.println(findThePrefixCommonArray(A, B));
    }

    public static int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] arr1=new int[A.length];
        int[] arr2=new int[B.length];
        for (int i = 0; i < arr2.length; i++) {
            arr1[i]=A[i];
            arr2[i]=B[i];
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(B));
        return arr1;
    }
}