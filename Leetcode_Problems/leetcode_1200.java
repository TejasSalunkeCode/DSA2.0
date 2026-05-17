import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode_1200 {
    public static void main(String[] args) {
        int[] arr = { 1,3,6,10,15 };
        System.out.println(minimumAbsDifference(arr));
    }

    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        List<List<Integer>> list = new ArrayList<>();
        int min=Integer.MAX_VALUE;
        boolean flag=true;
        int i=0;

        while (flag==true) {
            if(i+1<=arr.length-1) {
                min=Math.min(min, arr[i+1]-arr[i]);
                i++;
            }else{
                flag=false;
            }  
        }
        i=0;
        while (flag==false) {
             if(i+1<=arr.length-1) {
               if(arr[i+1]-arr[i]==min){
                list.add(Arrays.asList(arr[i],arr[i+1]));
            }
        }else{
            flag=true;
        }  
        i++;
        }

        return list;

    }
}
