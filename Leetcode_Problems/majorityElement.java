import java.util.Arrays;

public class majorityElement {

    public static void main(String[] args) {
        int[]arr={2,2,1,1,1,2,2,1,1,1,1,3};
        System.out.println(majority(arr));
    }

    public static int majority(int[]arr){
        int cnt=0;
        int ele=0;
        for (int i = 0; i < arr.length; i++) {
            if(cnt==0){
                cnt=1;
                ele=arr[i];
            }
            else if(arr[i]==ele){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        int cnt1=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==ele){
                cnt1++;
            }
        }
        if(cnt1>(arr.length/2)){
            return ele;
        }
        return -1;
    }
}
