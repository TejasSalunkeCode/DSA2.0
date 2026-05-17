import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leaders {
    public static void main(String[] args) {
        int[] arr = { 10, 22, 12, 3, 0, 6 };
        System.out.println(leade(arr));

    }

    public static List<Integer> leade(int[] arr) {
        int max = Integer.MIN_VALUE;
        List<Integer> res = new ArrayList<>();

        for (int i = arr.length-1; i >=0; i--) {
            if(arr[i]>max){
                res.add(arr[i]);
            }
            max=Math.max(max, arr[i]);
        }
        return res;

    }

}
