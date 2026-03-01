public class leetcode_1545 {
    public static void main(String[] args) {
        System.out.println(findkthbit(4, 11));
    }
    public static char findkthbit(int n,int k){
        if(n==1){
            return '0';
        }
        int length=(1<<n)-1;
        int mid=(length/2)+1;

        if(k<mid){
            return findkthbit(n-1, k);
        }else if(k==mid){
            return '1';
        }else{
            char ch=findkthbit(n-1, length-k+1);
            return (ch=='0') ? '1' : '0';
        }
    }
}
