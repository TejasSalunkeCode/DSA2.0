public class test2 {

    public static void main(String[] args) {
        System.out.println(reverse(123));
    }

    static int reverse(int x) {
        int temp = x;
        int reversed=0;
        while (temp != 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }
        return reversed;
    }

}
