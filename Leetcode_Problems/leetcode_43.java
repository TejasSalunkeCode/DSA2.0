public class leetcode_43 {
    public static void main(String[] args) {
        String  num1 = "2", num2 = "3";
        System.out.println(multiply(num1, num2));
    }

    public static String multiply(String num1, String num2) {
        long Intnum=Long.parseLong(num1);
        long Intnum2=Long.parseLong(num2);
        long ans=Intnum*Intnum2;
        return Long.toString(ans);
    }
}
