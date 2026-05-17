public class leetcode_1009 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(bitwiseComplement(n));
    }

    public static int bitwiseComplement(int n) {
        String binary = Integer.toBinaryString(n);
        String str = "";
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '0') {
                str += '1';
            } else {
                str += '0';
                ;
            }
        }
        System.out.println(str);
       int num=Integer.parseInt(str,2);
        return num;
    }
}