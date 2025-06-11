public class leetcode_509 {
    class Solution {
    public int fib(int n) {
        int ans=0;
        int first=0;
        int second=1;
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
        ans=fib(n-1)+fib(n-2);
        return ans;
        }
    }
}
}
