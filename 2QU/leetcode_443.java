public class leetcode_443 {
    public static void main(String[] args) {
        char[] chars = { 'a', 'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b' };
        System.out.println(compress(chars));
    }

    public static int compress(char[] chars) {

        char currentchar;
        int count = 0;
        int index = 0;
        int k = 0;

        for (int i = 0; i < chars.length; i++) {
            currentchar = chars[k];
            if (currentchar == chars[i]) {
                count++;
            } else {
                k = i;
                if (count != 1) {
                    chars[index] = currentchar;
                    String cnt = Integer.toString(count);
                }
                System.out.println(count);
                count = 1;
            }
        }
        System.out.println(count);

        return index;

    }
}
