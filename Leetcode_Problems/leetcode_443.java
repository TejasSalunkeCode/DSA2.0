public class leetcode_443 {
    public static void main(String[] args) {
        char[] chars = {'a','b','c','d' };
        System.out.println(compress(chars));
    }

    public static int compress(char[] chars) {

        char currentchar;
        int count = 0;
        int index = 0;
        int k = 0;
        int j = 0;
        if(chars.length==1){
            return 1;
        }
        for (int i = 0; i < chars.length+1; i++) {
            currentchar = chars[k];
            if (i < chars.length && currentchar == chars[i]) {
                count++;
                // if(i+1>chars.length){
                // break;
                // }
            } else {
                System.out.println("hello"); 
                k = i;
                if(count==1){
                    chars[index]=currentchar;
                    index++;
                }
                else{
                    chars[index] = currentchar;
                    String cnt = Integer.toString(count);
                    int len = cnt.length();
                    while (len != 0) {
                        if (len > 0) {
                            index++;
                            chars[index] = cnt.charAt(j);
                            j++;
                            len--;
                        }
                    }
                    j=0;
                    index++;
                }
                System.out.println(count);
                count = 1;
            }
        }
        System.out.println(count);

        return index;

    }
}
