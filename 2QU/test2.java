

 class leetcode_231 {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));
    }
    static boolean isPowerOfTwo(int n) {
       if (n <= 0) return false;
        int sum = 1;
        if(n==1){
            return true;
        }
        while (sum < n && sum <= Integer.MAX_VALUE / 2) { 
            sum *= 2;
            if (sum == n) return true;
        }
        return false;
    }
}
