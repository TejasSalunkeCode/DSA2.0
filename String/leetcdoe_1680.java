package String;

public class leetcdoe_1680 {
     public static void main(String[] args) {
        int n = 12;
        System.out.println(concatenatedBinary(n));
    }

    public static int concatenatedBinary(int n) {
        String res="";
        for (int i = 1; i <=n; i++) {
            res=res+Integer.toBinaryString(i);
        }
        int finalRes=Integer.parseInt(res,2);

        System.out.println(res);
        return finalRes;
    }
}
