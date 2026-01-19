public class leetcode_3658 {

    public static void main(String[] args) {
        int n = 4;
        System.out.println(gcdOfOddEvenSums(n));
    }

    public static int gcdOfOddEvenSums(int n) {
        int odd = 1, oddsum = 0;
        int sum = 0, evensum = 0;

        for (int i = 0; i < n; i++) {
            odd = odd + 2;
            oddsum = oddsum + odd;
            // System.out.println(oddsum);
            sum = sum + 2;
            evensum = evensum + sum;
        }
        oddsum = oddsum - odd + 1;

        System.out.println(oddsum);
        System.out.println(evensum);

        while (oddsum>0 && evensum>0) {
            if(oddsum>evensum){
                oddsum=oddsum%evensum;
            }else{
                evensum=evensum%oddsum;
            }
        }
        if(oddsum==0){
            return evensum;
        }
        
       return oddsum;
    }
}
