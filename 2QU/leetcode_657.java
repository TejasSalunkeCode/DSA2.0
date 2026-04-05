public class leetcode_657{
    public static void main(String[] args) {
        String moves = "UD";
        System.out.println(judgeCircle(moves));
    }
   public static boolean judgeCircle(String moves) {
        int c1=0;
        int c2=0;
        int c3=0;
        int c4=0;
        for (int i = 0; i < moves.length(); i++) {
            if(moves.charAt(i)=='U'){
                c1++;
            }
            
            if(moves.charAt(i)=='D'){
                c2++;
            }
            
            if(moves.charAt(i)=='L'){
                c3++;
            }
            
            if(moves.charAt(i)=='R'){
                c4++;
            }
            
        }
        if(c1==c2 && c3==c4){
            return true;
        }
        return false;
    }
}