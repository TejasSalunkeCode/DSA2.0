public class leetcode_3227 {
    public static void main(String[] args) {
        String s="leetcoder";
        doesAliceWin(s);
    }
     static boolean doesAliceWin(String s) {
        char[] ch = s.toCharArray();
        int count = 0;

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'A'
                    || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {
                count++;
            }
        }
        if(count==0){
            return false;
        }
        // else{
        //     rt
        // }
        // if(count%2!=0){
        //     return true;
        // }

        System.out.println(count);
        return true;
    }
}
