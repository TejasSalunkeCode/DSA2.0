
public class leetcode_58 {
    public static void main(String[] args) {
      String str="Hello Java ";

        System.out.println(lengthOfLastWord(str));
    }
       static int lengthOfLastWord(String s) {
       int count=0;
       for(int i=s.length()-1;i>=0;i--){
        char ch=s.charAt(i);

        if(ch!=' '){
            count++;
        }else if(count !=0){
            break;
        }
       } 
        return count;
    } 
}
