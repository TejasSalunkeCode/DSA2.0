import java.lang.reflect.Array;
import java.util.Arrays;

public class test {

    public static void main(String[] args) {
       char[] arr = {'h', 'e', 'l', 'l', 'o'};
       reverseString(arr);
        System.out.println(arr);
    }
    static void reverseString(char[] s) {
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]);
        }
        System.out.println();
        for (int j =s.length-1; j >=0; j--) {
          System.out.println(Arrays.toString(s[j]));
        }
        System.out.println();
    }
}
