import java.util.Arrays;

public class leetcode_1323 {
    public static void main(String[] args) {
        int num=9999;
        System.out.println(maximum69Number(num));
    }
    static int maximum69Number (int num) {
       String str = String.valueOf(num);
        char[] arr = str.toCharArray();

       for (int i = 0; i < arr.length; i++) {
         if(arr[i]=='6'){
            arr[i]='9';
            System.out.println(Arrays.toString(arr));
            String str2= new String(arr);
            int num2=Integer.parseInt(str2);
            return num2;
         }
       }
       

       return num;

}
}