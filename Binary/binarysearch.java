public class binarysearch {
   public static void main(String[] args) {
     int []arr={12,45,67,78,79,89,90,91};
     int target=79;
     int ans=binarysearchh(arr, target);
     System.out.println(ans);
   }
    static int binarysearchh(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
        while (start<=end) {
            int mid=start+(end-start)/2;

            if(target<arr[mid]){
             end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return-1;
    }
}
