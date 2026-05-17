public class demo3 {
    public static void main(String[] args) {
        String num = "800000";
        System.out.println(largestGoodInteger(num));
    }

    static String largestGoodInteger(String num) {
        String num1 = "";
        String num2 = "";
        int length = num.length();
        System.out.println(length);
        String temp = "";

        for (int i = 0; i < length - 2; i++) {

            if (num1.isEmpty() == false && num2.isEmpty() == false) {
                int Intnum1 = Integer.parseInt(num1);
                int Intnum2 = Integer.parseInt(num2);

                if (Intnum1 > Intnum2) {
                    String str = String.valueOf(Intnum2);
                    str = "";
                    num2 = str;
                }
                if (Intnum1 < Intnum2) {
                    String str2 = String.valueOf(Intnum1);
                    str2 = "";
                    num1 = str2;
                }
                if (Intnum1 == Intnum2) {
                    String str3 = String.valueOf(Intnum1);
                    str3 = "";
                    num1 = str3;
                }
            }

            if (num.charAt(i) == num.charAt(i + 1) && num.charAt(i + 1) == num.charAt(i + 2)
                    && num1.isEmpty() == true) {
                num1 = num1 + num.charAt(i) + num.charAt(i + 1) + num.charAt(i + 2);
                continue;
            }
            if (num.charAt(i) == num.charAt(i + 1) && num.charAt(i + 1) == num.charAt(i + 2)
                    && num2.isEmpty() == true) {
                num2 = num2 + num.charAt(i) + num.charAt(i + 1) + num.charAt(i + 2);
            }

        }
        if (num1.isEmpty() == true && num2.isEmpty() == true) {
            return "";
        }
        if (num2.isEmpty()) {
            return num1;
        }
        if (num1.isEmpty()) {
            return num2;
        }
        System.out.println(num1);
        System.out.println(num2);
        int Intnum1 = Integer.parseInt(num1);
        int Intnum2 = Integer.parseInt(num2);
        String str2;
        if(Intnum1==Intnum2 && Intnum1==0){
            String str = String.valueOf(Intnum1);
            return "000";
        }

        if (Intnum1 > Intnum2) {
            String str = String.valueOf(Intnum1);
            return str;
        } else if (Intnum1 == Intnum2) {
            String str4 = String.valueOf(Intnum2);
            return str4;
        } else {
            str2 = String.valueOf(Intnum2);
            // return str2;
        }

        // System.out.println("hello");

        return str2;
    }
}
