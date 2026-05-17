public class leetcode_2169 {
    public static void main(String[] args) {
        int num1 = 2, num2 = 3;
        System.out.println(countOperations(num1, num2));
    }

    public static int countOperations(int num1, int num2) {
        int count=0;
        if(num1==num2){
            return 1;
        }
        while(true){
            if(num1<num2){
                num2=num2-num1;
                count++;
            }else{
                num1=num1-num2;
                count++;
            }
            if(num1==0 || num2==0){
                break;
            }
            System.out.println(num1+"a");
            System.out.println(num2+"b");
        }
        return count;
    }
}
