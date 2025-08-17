import java.util.Arrays;

public class leetcode_387 {

    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(firstUniqChar(s));
    }

    static int firstUniqChar(String s) {
        char[] arr = s.toCharArray();
        System.out.println(Arrays.toString(arr));
        int count=0;
        System.out.println(s.length());

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] != arr[j]) {
                    count++;
                    // continue;
                }
            }
            if(count==s.length()-1){
                return i;
            }
            System.out.println(count);
            count=0;
        }

        return -1;
    }
}