public class runCode {

    public static void main(String[] args) {
        String num = "42352338";
        System.out.println(largestGoodInteger(num));
    }

    static String largestGoodInteger(String num) {
        String num1 = "";
        String num2 = "";
        int length = num.length();
        System.out.println(length);

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                for (int k = j + 1; k < length; k++) {
                    if (num.charAt(i) == num.charAt(j) && num.charAt(j) == num.charAt(k) && num1.isEmpty() == true) {
                        num1 = num1 + num.charAt(i) + num.charAt(j) + num.charAt(k);
                        System.out.println(num1);
                        break;
                    }
                    if (num.charAt(i) == num.charAt(j) && num.charAt(j) == num.charAt(k) && num2.isEmpty() == true) {
                        num2 = num2 + num.charAt(i) + num.charAt(j) + num.charAt(k);
                        System.out.println(num2);
                    }

                }
            }
        }
        if(num1.isEmpty()==true && num2.isEmpty()==true){
            return "";
        }
        if(num2.isEmpty()){
            return num1;
        }
        int Intnum1 = Integer.parseInt(num1);
        int Intnum2 = Integer.parseInt(num2);
        String str2;

        if (Intnum1 > Intnum2) {
            String str = String.valueOf(Intnum1);
            return str;
        } else {
            str2 = String.valueOf(Intnum2);
            // return str2;
        }

        // System.out.println("hello");

        return str2;
    }
}
