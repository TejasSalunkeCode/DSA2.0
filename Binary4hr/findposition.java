public class findposition {
    public static void main(String[] args) {
       int []arr={2,4,6,8,9,11,15,19,21,26,29,45,67,89,99,101,111,222,234};
       int target=67;
       System.out.println(ans(arr, target));
    }
    static int ans(int[] arr,int target){

        int start=0;
        int end=1;
        while (target>arr[end]) {
            int newstart=end+1;
            end=(end+(end-start+1)*2);
            start=newstart;
        }

        System.out.println("print hello");
         return binarysearch(arr, target, start, end);
    }

    static int binarysearch(int[] arr, int target, int start, int end){
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
     return -1;
    }
}
