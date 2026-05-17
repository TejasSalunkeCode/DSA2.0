public class leetcode_1903 {
    public static void main(String[] args) {
        String num = "111222333";
        System.out.println(largestOddNumber(num));
    }

    public static String largestOddNumber(String num) {
        String val = String.valueOf(num.charAt(num.length() - 1));
        if (val.equals("1") || val.equals("3") || val.equals("5") || val.equals("7") || val.equals("9")) {
            return num;
        }
        int max = 1;
        int cnt = 0;
        for (int i = 0; i < num.length(); i++) {
            String val2 = String.valueOf(num.charAt(i));
            int number = Integer.parseInt(val2);

            if (number % 2 != 0 && number >= max) {
                max = number;
                cnt++;
            }
        }
        if (cnt == 0) {
            return "";
        }
        return Integer.toString(max);

    }
}
