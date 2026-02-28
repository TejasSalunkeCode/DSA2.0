package String;

public class leetcdoe_1680 {
     public static void main(String[] args) {
        int n = 12;
        System.out.println(concatenatedBinary(n));
    }

    public static int concatenatedBinary(int n) {
       long res = 0;               
        int mod = 1_000_000_007;   

        for (int i = 1; i <= n; i++) {
            int bits = Integer.toBinaryString(i).length();
            res = ((res << bits) + i) % mod;            
        }

        return (int) res;  
    }
}
