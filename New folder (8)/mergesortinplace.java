import java.util.Arrays;
public class mergesortinplace {
    public static void main(String[] args) {
        int[]arr={8,3,12,5,17};
        // arr=mergesorttinplace(arr,);
       mergesorttinplace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
        // System.out.println(arr);
    }
    static void mergesorttinplace(int[]arr,int s,int e){
        
        if(e-s==1){
            return;
        }
        int mid=arr.length/2;

        mergesorttinplace(arr, s, mid);
        mergesorttinplace(arr, mid, e);

       mergeinplace(arr,s,mid,e);
    }
    static void mergeinplace(int[] arr,int s,int m,int e){
        int[]mix=new int[e-s];
        int i=s;
        int j=m;
        int k=0;

        while (i<m && j<e) {
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }
            else{
                mix[k]=arr[j];
                j++;
            }
            k++;
        }
        //it may be possible that one of the arrays is not complete
        //copy the remaining element
        while (i<m) {
            mix[k]=arr[i];
            i++;
            k++;
        }
        while (j<e) {
            mix[k]=arr[j];
            j++;
            k++;
        }
        for (int k2 = 0; k2 < mix.length; k2++) {
            arr[s+k2]=mix[k2];
        }
    }
}


