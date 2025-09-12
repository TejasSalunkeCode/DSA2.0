import java.util.Arrays;

public class leetcode_2785 {
    public static void main(String[] args) {
        String s = "lEetcOde";
        System.out.println(sortVowels(s));
    }

    static String sortVowels(String s) {
        char[] ch = s.toCharArray();
        int count = 0;

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'A'
                    || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {
                count++;
            }
        }
        char[] arr = new char[count];
        char[] arr2 = new char[ch.length];
        int k = 0, m = 0;

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'A'
                    || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {
                arr[k] = ch[i];
                k++;
            }
        }
        // for (int i = 0; i < ch.length; i++) {
        // if (ch[i] != 'a' && ch[i] != 'e' && ch[i] != 'i' && ch[i] != 'o' && ch[i] !=
        // 'u' && ch[i] != 'A'
        // && ch[i] != 'E' && ch[i] != 'I' && ch[i] != 'O' && ch[i] != 'U') {
        // arr2[m] = ch[i];
        // m++;
        // }
        // }

        char temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((int) arr[i] > (int) arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int l = 0;

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'A'
                    || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {
                ch[i] = arr[l];
                l++;
            }
        }

        // System.out.println(arr);
        // System.out.println(ch);
        // System.out.println(arr2);

      String str1 = new String(ch);



        return str1;
    }
}
