import java.util.ArrayList;
import java.util.List;

public class findAllMissing {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,3,2,7,8};

        System.out.println(cyclicc(arr));
    }

    static List<Integer> cyclicc(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            } 
        }

        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                ans.add(arr[index+1]);
            }
        }
        return ans;

    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
