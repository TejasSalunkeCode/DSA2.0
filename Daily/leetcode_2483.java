import java.util.Arrays;

public class leetcode_2483 {
    public static void main(String[] args) {
        String custom = "YYNY";
        System.out.println(bestClosingTime(custom));
    }

    public static int bestClosingTime(String customers) {
        char[] arr = customers.toCharArray();
        int[] arr2 = new int[arr.length];
        int[] ans = new int[arr.length];

        int k=0;
        int sum=0;

        for (int i = 0; i < arr.length; i++) {
             if(arr[i]=='Y'){
                    arr2[k]=1;
                    k++;
                }
                if(arr[i]=='N'){
                    arr2[k]=0;
                    k++;
                }
        }
        System.out.println(Arrays.toString(arr2));

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < ans.length; j++) {
                if(arr2[i]==1){
                    arr2[i]=0;
                }
                if(arr2[i]==0){
                    arr2[i]=1;
                }
                System.out.println(Arrays.toString(arr2));
                for (int j2 = 0; j2 < arr2.length; j2++) {
                    sum=sum+arr2[j2];
                    break;
                }
                // System.out.println(sum+" kk");
                break;
            }
        }
        
        return 2;
    }
}
