package _53_BigInteger;

import java.math.BigDecimal;
import java.math.BigInteger;

public class main {
    public static void main(String[] args) {
        // BD();
        BI();
    }

    static void BD() {
        double x = 0.03;
        double y = 0.04;
        // double ans=y-x;
        // System.out.println(ans);

        BigDecimal X = new BigDecimal("0.03");
        BigDecimal Y = new BigDecimal("0.04");
        BigDecimal ans = Y.subtract(X);
        // System.out.println(ans);

        BigDecimal a = new BigDecimal("345677665434.34567");
        BigDecimal b = new BigDecimal("198765445678.34567");

        // oprations
        System.out.println(b.add(a));
        System.out.println(b.subtract(a));
        System.out.println(b.multiply(a));
        System.out.println(b.pow(2));
        System.out.println(b.negate());

        // constants
        BigDecimal con = BigDecimal.ONE;
        System.out.println(con);
    }

    static void BI() {
        int a = 30;
        int b = 67;

        BigInteger B = BigInteger.valueOf(6); // convert int/long to BI
        int c = B.intValue(); // convert BI to Int

        BigInteger C = new BigInteger("12345678098765423456776543");
        BigInteger X = new BigInteger("876543345456");

        // constants
        BigInteger D = BigInteger.TEN;
        System.out.println(D);

        // operations
        BigInteger s = C.add(X);
        System.out.println(s);

        BigInteger m = C.multiply(X);
        System.out.println(m);

        BigInteger sub = C.subtract(X);
        System.out.println(sub);

        BigInteger d = C.divide(X);
        System.out.println(d);

        BigInteger rem = C.remainder(X);
        System.out.println(rem);

        if (X.compareTo(C) < 0) {
            System.out.println("yes");
        }
        System.out.println(factorial.fact(100));
    }
}
