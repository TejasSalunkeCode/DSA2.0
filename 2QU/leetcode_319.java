public class leetcode_319 {
    public static void main(String[] args) {
        System.out.println(bulbSwitch(15));
    }
    static int bulbSwitch(int n) {
        int ans=0;
        // int [n]arr;

        for(int i=1;i<=n;i++){
            if(i*i<=n){
                ans++;
            }else{
                return ans;
            }
        }
        return ans;
    }
}
