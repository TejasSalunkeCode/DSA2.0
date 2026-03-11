public class leetcode_c1 {
    public static void main(String[] args) {
        int[] att = { 1, 5, 3, 7 };
        int itemSize = 3;
        System.out.println(minimumIndex(att, itemSize));
    }

    public static int minimumIndex(int[] capacity, int itemSize) {
        int index=-1;
        int mint=Integer.MAX_VALUE;
        for (int i = 0; i < capacity.length; i++) {
            if(capacity[i]>=itemSize && capacity[i]<mint){
                mint=Math.min(mint, capacity[i]);
                index=i;
            }
        }
        return index;
    }
}